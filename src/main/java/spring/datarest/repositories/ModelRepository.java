package spring.datarest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.datarest.models.Model;

public interface ModelRepository extends JpaRepository<Model, Long> {
}
