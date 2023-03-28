package power.plant.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "정산", url = "${api.url.정산}")
public interface 정산Service {
    @RequestMapping(method = RequestMethod.POST, path = "/정산")
    public void createMeter(@RequestBody 정산 정산);
}
