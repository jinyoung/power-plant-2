package power.plant.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import power.plant.마스터Application;

@Entity
@Table(name = "시장가_table")
@Data
public class 시장가 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private 가격 가격;

    public static 시장가Repository repository() {
        시장가Repository 시장가Repository = applicationContext()
            .getBean(시장가Repository.class);
        return 시장가Repository;
    }

    public static ApplicationContext applicationContext() {
        return 마스터Application.applicationContext;
    }
}
