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
// @RequestMapping(value="/시장가")
@Transactional
public class 시장가Controller {

    @Autowired
    시장가Repository 시장가Repository;
}
