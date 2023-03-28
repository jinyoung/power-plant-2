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
// @RequestMapping(value="/계량")
@Transactional
public class 계량Controller {

    @Autowired
    계량Repository 계량Repository;

    @RequestMapping(
        value = "계량/{id}/generate",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public 계량 generate(
        @PathVariable(value = "id") String id,
        @RequestBody GenerateCommand generateCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /계량/generate  called #####");
        Optional<계량> optional계량 = 계량Repository.findById(id);

        optional계량.orElseThrow(() -> new Exception("No Entity Found"));
        계량 계량 = optional계량.get();
        계량.generate(generateCommand);

        계량Repository.save(계량);
        return 계량;
    }
}
