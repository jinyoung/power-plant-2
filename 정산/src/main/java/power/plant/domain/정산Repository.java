package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "정산", path = "정산")
public interface 정산Repository
    extends PagingAndSortingRepository<정산, String> {}
