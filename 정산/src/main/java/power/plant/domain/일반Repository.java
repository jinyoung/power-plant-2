package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "일반s", path = "일반s")
public interface 일반Repository
    extends PagingAndSortingRepository<일반, Long> {}
