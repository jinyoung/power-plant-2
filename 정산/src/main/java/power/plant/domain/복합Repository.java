package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "복합s", path = "복합s")
public interface 복합Repository
    extends PagingAndSortingRepository<복합, Long> {}
