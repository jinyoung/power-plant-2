package power.plant.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;
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
        /** TODO: Get request to 발전기정보
        power.plant.external.발전기정보viewQuery 발전기정보viewQuery = new power.plant.external.발전기정보viewQuery();
        power.plant.external.발전기정보Service 발전기정보Service = applicationContext().getBean(power.plant.external.발전기정보Service.class);
        power.plant.external.발전기정보 마스터 = 
            발전기정보Service.발전기정보view( {TODO: please put the id} );
        */

        MeterCreated meterCreated = new MeterCreated(this);
        meterCreated.publishAfterCommit();
    }

    public static 정산Repository repository() {
        정산Repository 정산Repository = applicationContext()
            .getBean(정산Repository.class);
        return 정산Repository;
    }

    public static ApplicationContext applicationContext() {
        return 정산Application.applicationContext;
    }

    public void calculate(CalculateCommand calculateCommand) {
        // implement the business logics here:

        Calculated calculated = new Calculated(this);
        calculated.publishAfterCommit();
    }
}
