package power.plant.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "발전기정보views",
    path = "발전기정보views"
)
public interface 발전기정보viewRepository
    extends PagingAndSortingRepository<발전기정보view, Long> {}
