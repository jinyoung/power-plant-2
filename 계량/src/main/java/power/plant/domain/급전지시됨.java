package power.plant.domain;

import java.util.*;
import lombok.*;
import power.plant.domain.*;
import power.plant.infra.AbstractEvent;

@Data
@ToString
public class 급전지시됨 extends AbstractEvent {

    private Long id;

    public 급전지시됨(계량 aggregate) {
        super(aggregate);
    }

    public 급전지시됨() {
        super();
    }
}
