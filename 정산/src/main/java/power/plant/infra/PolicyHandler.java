package power.plant.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import power.plant.config.kafka.KafkaProcessor;
import power.plant.domain.*;

@Service
@Transactional(rollbackFor = Exception.class)
public class PolicyHandler {

    @Autowired
    정산Repository 정산Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(
        @Payload String eventString,
        @Header(KafkaHeaders.ACKNOWLEDGMENT) Acknowledgment acknowledgment,
        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) byte[] messageKey
    ) {
        /*
          // Call port method with received messageKey to publish msg to the same partition. //
          DomainClass.portMethod(eventString, new String(messageKey));
          
          // ,or //
          new EventRaised(domain Obj).publishAfterCommit(new String(messageKey));
          // manual Offset Commit. //
          acknowledgment.acknowledge();  
          */
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PowerGenerated'"
    )
    public void wheneverPowerGenerated_Calculate(
        @Payload PowerGenerated powerGenerated,
        @Header(KafkaHeaders.ACKNOWLEDGMENT) Acknowledgment acknowledgment,
        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) byte[] messageKey
    ) {
        PowerGenerated event = powerGenerated;
        System.out.println(
            "\n\n##### listener Calculate : " + powerGenerated + "\n\n"
        );

        CalculateCommand calculateCommand = new CalculateCommand();
        // implement:  Map command properties from event

        정산Repository
            .findById(
                // implement: Set the 정산 Id from one of PowerGenerated event's corresponding property

            )
            .ifPresent(정산 -> {
                정산.calculate(calculateCommand);
            });

        // Manual Offset Commit //
        acknowledgment.acknowledge();
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='입찰됨'"
    )
    public void whenever입찰됨_CreateMeter(
        @Payload 입찰됨 입찰됨,
        @Header(KafkaHeaders.ACKNOWLEDGMENT) Acknowledgment acknowledgment,
        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) byte[] messageKey
    ) {
        입찰됨 event = 입찰됨;
        System.out.println(
            "\n\n##### listener CreateMeter : " + 입찰됨 + "\n\n"
        );

        정산 정산 = new 정산();
        정산Repository.save(정산);

        // Manual Offset Commit //
        acknowledgment.acknowledge();
    }
}
