package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "시장가", path = "시장가")
public interface 시장가Repository
    extends PagingAndSortingRepository<시장가, String> {}
