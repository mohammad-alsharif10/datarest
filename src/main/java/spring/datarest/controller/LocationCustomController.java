package spring.datarest.controller;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.datarest.models.Location;
import spring.datarest.repositories.LocationRepository;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/")
public class LocationCustomController {

    private LocationRepository locationRepository;

    public LocationCustomController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @RequestMapping(method = POST, value = "/api/locations")
    public Location saveLocation(@RequestBody Location location) {
        locationRepository.save(location);
        System.out.println("hello");
        return location;
    }
}
