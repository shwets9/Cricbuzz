package com.cloud.dbservice.resource;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.dbservice.model.Details;

@RestController 
public class DbService {
	
	@Autowired
	private DetailsRepository detailsRepository;
	
	@GetMapping("/{id}")
	public Details getDetails(@PathVariable("id") ObjectId id )
	{
		return detailsRepository.findBy_id(id);	
	}
	
	@GetMapping("/")
	public List<Details> getall()
	{
		
		
		return detailsRepository.findAll();
		
		
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Details add(@Valid @RequestBody Details details){
		details.set_id(ObjectId.get());
		detailsRepository.save(details);
		
		return details;
		
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	  public void delete(@PathVariable ObjectId id) {
	    detailsRepository.delete( detailsRepository.findBy_id(id));
	  }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public Details modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Details details) {
	    details.set_id(id);
	    return detailsRepository.save(details);
	  }
}
