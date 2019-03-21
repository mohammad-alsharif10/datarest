package spring.datarest.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import spring.datarest.models.Location;

@RepositoryRestResource(collectionResourceRel = "Locations"   )
public interface LocationRepository extends JpaRepository<Location, Long> {

    @RestResource(path = "idBetween",rel = "idBetween")
    Page<Location> findAllByIdBetweenOrderByCountryAscStateAsc(@Param("start") Long start, @Param("end") Long end, Pageable pageable);
}
