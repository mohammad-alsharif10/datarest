package spring.datarest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.datarest.models.Manufacturer;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}
