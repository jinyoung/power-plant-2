package power.plant.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import power.plant.domain.MeterCreated;
import power.plant.정산Application;

@Entity
@Table(name = "정산_table")
@Data
public class 정산 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String yearCode;

    private String monthCode;

    private String dayCode;

    private String subscriberId;

    private String platId;

    private Double generationAmount;

    private Double mep;

    @OneToMany
    private List<시간별계량치> 시간별계량치;

    @PostPersist
    public void onPostPersist() {
        MeterCreated meterCreated = new MeterCreated(this);
        meterCreated.publishAfterCommit();
        // Get request from 정산
        //power.plant.external.정산 정산 =
        //    Application.applicationContext.getBean(power.plant.external.정산Service.class)
        //    .get정산(/** mapping value needed */);

    }

    public static 정산Repository repository() {
        정산Repository 정산Repository = 정산Application.applicationContext.getBean(
            정산Repository.class
        );
        return 정산Repository;
    }

    public void calculate(CalculateCommand calculateCommand) {
        Calculated calculated = new Calculated(this);
        calculated.publishAfterCommit();
    }
}
