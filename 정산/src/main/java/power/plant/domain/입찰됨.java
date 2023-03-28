package power.plant.domain;

import java.util.*;
import lombok.*;
import power.plant.domain.*;
import power.plant.infra.AbstractEvent;

@Data
@ToString
public class 입찰됨 extends AbstractEvent {

    private String id;
    private String subscriberId;
    private String plantId;
    private Double generatedAmount;
    private String generatorType;
}
