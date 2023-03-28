package power.plant.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CalculateCommand {

    private String subscriberId;
    private String plantId;
    private String generatorType;
    private String hourCode;
    private Double generatedAmount;
}
