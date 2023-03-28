package power.plant.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import power.plant.마스터Application;

@Entity
@Table(name = "발전기정보_table")
@Data
public class 발전기정보 {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private Double 열효율;
    private Double vEPC;

    public static 발전기정보Repository repository() {
        발전기정보Repository 발전기정보Repository = applicationContext()
            .getBean(발전기정보Repository.class);
        return 발전기정보Repository;
    }

    public static ApplicationContext applicationContext() {
        return 마스터Application.applicationContext;
    }
}
