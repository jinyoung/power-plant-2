package power.plant.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MeteringView_table")
@Data
public class MeteringView {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
