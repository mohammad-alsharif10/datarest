package spring.datarest.validation;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;
import spring.datarest.exceptions.UpdateEntityExceptions;
import spring.datarest.models.Manufacturer;


@Component
@RepositoryEventHandler(Manufacturer.class)
public class ManufacturerEventHandler {


	  @HandleBeforeSave
	  public void handleBeforeCreate(Manufacturer m) {
		  //do a check to see if the name is a valid manufacturer
		  //...
		  System.out.println(m.getName());
		  //auditing
		  
		  //only allow new manufacturers to be created in the active state.
		  if(m.getId()==9) {
			  throw new UpdateEntityExceptions(" the id not found");
		  }
	  }
	
}
