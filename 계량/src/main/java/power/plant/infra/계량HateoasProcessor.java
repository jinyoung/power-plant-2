package power.plant.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import power.plant.domain.*;

@Component
public class 계량HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<계량>> {

    @Override
    public EntityModel<계량> process(EntityModel<계량> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/generate")
                .withRel("generate")
        );

        return model;
    }
}
