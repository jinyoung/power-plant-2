package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "중앙s", path = "중앙s")
public interface 중앙Repository
    extends PagingAndSortingRepository<중앙, Long> {}
