package power.plant.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import power.plant.domain.*;

@Component
public class 정산HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<정산>> {

    @Override
    public EntityModel<정산> process(EntityModel<정산> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/calculate")
                .withRel("calculate")
        );

        return model;
    }
}
