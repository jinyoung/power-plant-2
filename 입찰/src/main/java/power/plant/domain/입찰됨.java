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
    private String modelId;
    private Double generatedAmount;
    private String generatorType;

    public 입찰됨(입찰 aggregate) {
        super(aggregate);
    }

    public 입찰됨() {
        super();
    }
}
