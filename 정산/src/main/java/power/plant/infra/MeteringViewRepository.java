package power.plant.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import power.plant.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "meteringViews",
    path = "meteringViews"
)
public interface MeteringViewRepository
    extends PagingAndSortingRepository<MeteringView, Long> {}
