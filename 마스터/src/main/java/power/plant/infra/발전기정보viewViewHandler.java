package power.plant.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import power.plant.config.kafka.KafkaProcessor;
import power.plant.domain.*;

@Service
public class 발전기정보viewViewHandler {

    @Autowired
    private 발전기정보viewRepository 발전기정보viewRepository;
}
