package power.plant.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class 시간별계량치 {

    private Long hourCode;

    private Double power;

    private Double marketPrice;
}
