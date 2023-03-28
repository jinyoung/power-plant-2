package power.plant.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Entity
@Data
@DiscriminatorValue("수력")
public class 수력 extends 비중앙{

    Double vEPC;

    @Override
    public Double calculateMEP() {
        
        return Math.min(super.calculateMEP(), vEPC);
    }

    @Override
    public void init(){
        power.plant.external.발전기정보Service 발전기정보Service = applicationContext().getBean(power.plant.external.발전기정보Service.class);
        power.plant.external.발전기정보 마스터 = 
            발전기정보Service.발전기정보view( getModelId());

        setVEPC(마스터.getVEPC());
    }

}
