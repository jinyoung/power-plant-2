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
// @RequestMapping(value="/입찰")
@Transactional
public class 입찰Controller {

    @Autowired
    입찰Repository 입찰Repository;
}
