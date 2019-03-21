package spring.datarest.models.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import spring.datarest.models.Model;


@Projection(name = "modelDetail", types = {Model.class})
public interface modelProjection {

    String getName();

    @Value("#{target.modelType.name}")
    String getModelTypeName();

    @Value("#{target.manufacturer.name}")
    String getManufacturerName();

    @Value("#{target.manufacturer.headquarters.country}")
    String getCountry();

}
