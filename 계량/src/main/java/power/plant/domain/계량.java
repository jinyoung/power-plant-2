package power.plant.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import power.plant.domain.급전지시됨;
import power.plant.계량Application;

@Entity
@Table(name = "계량_table")
@Data
public class 계량 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String subscriberId;

    private String plantId;

    private Double generatedAmount;

    private String generatorType;

    @PostPersist
    public void onPostPersist() {
        급전지시됨 급전지시됨 = new 급전지시됨(this);
        급전지시됨.publishAfterCommit();
    }

    public static 계량Repository repository() {
        계량Repository 계량Repository = applicationContext()
            .getBean(계량Repository.class);
        return 계량Repository;
    }

    public static ApplicationContext applicationContext() {
        return 계량Application.applicationContext;
    }

    public void generate(GenerateCommand generateCommand) {
        // implement the business logics here:

        PowerGenerated powerGenerated = new PowerGenerated(this);
        powerGenerated.publishAfterCommit();
    }
}
