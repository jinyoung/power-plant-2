package power.plant.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(collectionResourceRel = "계량views", path = "계량views")
public interface 계량viewRepository
    extends PagingAndSortingRepository<계량view, Long> {}
