package power.plant.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import power.plant.domain.*;

@Component
public class 발전기정보HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<발전기정보>> {

    @Override
    public EntityModel<발전기정보> process(EntityModel<발전기정보> model) {
        return model;
    }
}
