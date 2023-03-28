package power.plant.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "계량view_table")
@Data
public class 계량view {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
