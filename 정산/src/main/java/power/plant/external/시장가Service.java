package power.plant.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "마스터", url = "${api.url.마스터}")
public interface 시장가Service {
    @GetMapping(path = "/시장가/{id}")
    public 시장가 시장가view(@PathVariable("id") Long id);
}
