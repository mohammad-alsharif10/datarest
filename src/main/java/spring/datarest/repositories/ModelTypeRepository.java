package spring.datarest.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import spring.datarest.models.ModelType;

import java.util.List;

public interface ModelTypeRepository extends JpaRepository<ModelType, Long> {

    List<ModelType> findAllByIdBetween(@Param("start") Long start, @Param("end") Long end, Pageable pageable);
}
