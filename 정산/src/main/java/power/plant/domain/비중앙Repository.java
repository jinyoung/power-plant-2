package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "비중앙s", path = "비중앙s")
public interface 비중앙Repository
    extends PagingAndSortingRepository<비중앙, Long> {}
