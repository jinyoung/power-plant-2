package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "계량", path = "계량")
public interface 계량Repository
    extends PagingAndSortingRepository<계량, String> {}
