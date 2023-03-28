package power.plant.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "발전기정보view_table")
@Data
public class 발전기정보view {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
