package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	Interface f1;
	
	@GetMapping("/get")
	public List<BusInfo> getDetails()
	{
		System.out.println("All Data Have been Displayed Successfully");
		return f1.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		f1.deleteById(id);
		return "Id : "+id+" is deleted";
	}
	
	@PostMapping("/post")
	public String postDetails(@RequestBody BusInfo z)
	{
		f1.save(z);
		return "Bus Details Successfully Stored in The DataBase";
	}
	
	@PutMapping("/put/{id}")
	public BusInfo updateBusDetails(@RequestBody BusInfo y)
	{
		System.out.println("The Changes made Successfully in the Database");
		return f1.save(y);
	}
}
