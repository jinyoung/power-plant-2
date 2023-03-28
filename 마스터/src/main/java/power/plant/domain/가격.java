package power.plant.domain;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class 가격 {
    String hourCode;
    Double price;
    
}
