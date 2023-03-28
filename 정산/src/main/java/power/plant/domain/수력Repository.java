package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "수력s", path = "수력s")
public interface 수력Repository
    extends PagingAndSortingRepository<수력, Long> {}
