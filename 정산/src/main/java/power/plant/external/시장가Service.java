package power.plant.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Aggregate 별 X 혹은 name 을 aggregate 명으로 O
@FeignClient(name = "market", url = "${api.url.마스터}")
public interface 시장가Service {
    @GetMapping(path = "/시장가/{id}")
    public 시장가 시장가view(@PathVariable("id") String id);
}
