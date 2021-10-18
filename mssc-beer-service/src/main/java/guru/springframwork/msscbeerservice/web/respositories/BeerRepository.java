package guru.springframwork.msscbeerservice.web.respositories;

import guru.springframwork.msscbeerservice.web.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
