package power.plant.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import power.plant.domain.*;

@RestController
// @RequestMapping(value="/정산")
@Transactional
public class 정산Controller {

    @Autowired
    정산Repository 정산Repository;

    @RequestMapping(
        value = "정산/{id}/calculate",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public 정산 calculate(
        @PathVariable(value = "id") String id,
        @RequestBody CalculateCommand calculateCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /정산/calculate  called #####");
        Optional<정산> optional정산 = 정산Repository.findById(id);

        optional정산.orElseThrow(() -> new Exception("No Entity Found"));
        정산 정산 = optional정산.get();
        정산.calculate(calculateCommand);

        정산Repository.save(정산);
        return 정산;
    }
}
