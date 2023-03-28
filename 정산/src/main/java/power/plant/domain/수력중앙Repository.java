package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "수력중앙s", path = "수력중앙s")
public interface 수력중앙Repository
    extends PagingAndSortingRepository<수력중앙, Long> {}
