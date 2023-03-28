package power.plant.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import power.plant.domain.*;

@Component
public class 입찰HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<입찰>> {

    @Override
    public EntityModel<입찰> process(EntityModel<입찰> model) {
        return model;
    }
}
