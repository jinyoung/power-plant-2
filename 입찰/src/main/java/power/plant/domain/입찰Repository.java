package power.plant.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "bids", path = "bids")
public interface 입찰Repository
    extends PagingAndSortingRepository<입찰, String> {}
