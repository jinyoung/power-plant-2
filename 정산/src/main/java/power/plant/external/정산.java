package power.plant.external;

import java.util.Date;
import lombok.Data;

@Data
public class 정산 {

    private String id;
    private String yearCode;
    private String monthCode;
    private String dayCode;
    private String subscriberId;
    private String platId;
    private Double generationAmount;
    private Double mep;
    private Object 시간별계량치;
}
