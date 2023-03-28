package power.plant.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Entity
@Data
public class 비중앙 extends 정산{@Override
    public Double calculateMEP() {
        return get시간별계량치().entrySet().stream()
            .map(entry -> entry.getValue())
            .map(계량치 -> {
                if(계량치.getMarketPrice()==null || 계량치.getPower()==null) 
                    return 0.0; 
                else 
                    return 계량치.getMarketPrice() * 계량치.getPower();
            })
            .reduce(0.0, (금액1, 금액2) -> {return 금액1+금액2;});
    }

    @Override
    public Double calculateSMP() {
        return get시간별계량치().entrySet().stream()
            .map(entry -> entry.getValue())
            .map(계량치 -> 계량치.getMarketPrice() * 계량치.getPower())
            .reduce(0.0, (금액1, 금액2) -> {return 금액1+금액2;});
    }

}
