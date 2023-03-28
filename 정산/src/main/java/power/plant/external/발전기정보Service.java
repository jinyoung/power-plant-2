package power.plant.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "master", url = "${api.url.마스터}")
public interface 발전기정보Service {
    @GetMapping(path = "/발전기정보/{id}")
    public 발전기정보 발전기정보view(@PathVariable("id") Long id);
}
