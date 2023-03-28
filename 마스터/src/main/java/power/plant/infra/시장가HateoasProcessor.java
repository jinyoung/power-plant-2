package power.plant.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import power.plant.domain.*;

@Component
public class 시장가HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<시장가>> {

    @Override
    public EntityModel<시장가> process(EntityModel<시장가> model) {
        return model;
    }
}
