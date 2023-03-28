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
}
