package power.plant.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import power.plant.config.kafka.KafkaProcessor;
import power.plant.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    정산Repository 정산Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PowerGenerated'"
    )
    public void wheneverPowerGenerated_Calculate(
        @Payload PowerGenerated powerGenerated
    ) {
        PowerGenerated event = powerGenerated;
        System.out.println(
            "\n\n##### listener Calculate : " + powerGenerated + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='입찰됨'"
    )
    public void whenever입찰됨_CreateMeter(@Payload 입찰됨 입찰됨) {
        입찰됨 event = 입찰됨;
        System.out.println(
            "\n\n##### listener CreateMeter : " + 입찰됨 + "\n\n"
        );
        // Sample Logic //

    }
}
