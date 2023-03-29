package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "model-infos",
    path = "model-infos"
)
public interface 발전기정보Repository
    extends PagingAndSortingRepository<발전기정보, String> {}
