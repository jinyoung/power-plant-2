package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "양수s", path = "양수s")
public interface 양수Repository
    extends PagingAndSortingRepository<양수, Long> {}
