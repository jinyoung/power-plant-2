package power.plant.domain;

import java.util.*;
import lombok.*;
import power.plant.domain.*;
import power.plant.infra.AbstractEvent;

@Data
@ToString
public class MeterCreated extends AbstractEvent {

    private String id;
    private String yearCode;
    private String monthCode;
    private String dayCode;
    private String subscriberId;
    private String platId;
    private Double generationAmount;
    private Double sep;

    public MeterCreated(정산 aggregate) {
        super(aggregate);
    }

    public MeterCreated() {
        super();
    }
}
