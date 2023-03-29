package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "billings", path = "billings")
public interface 정산Repository
    extends PagingAndSortingRepository<정산, String> {}
