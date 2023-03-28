package power.plant.domain;

import java.util.*;
import lombok.*;
import power.plant.domain.*;
import power.plant.infra.AbstractEvent;

@Data
@ToString
public class PowerGenerated extends AbstractEvent {

    private String id;
    private String subscriberId;
    private Double generatedAmount;
    private String generatorType;
    private String plantId;
}
