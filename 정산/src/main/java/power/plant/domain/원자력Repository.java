package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "원자력s", path = "원자력s")
public interface 원자력Repository
    extends PagingAndSortingRepository<원자력, Long> {}
