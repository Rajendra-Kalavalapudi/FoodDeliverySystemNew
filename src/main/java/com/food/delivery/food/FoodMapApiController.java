package com.food.delivery.food;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.bean.*;
@RestController
@RequestMapping("/foodMap")
public class FoodMapApiController {

	
	@Autowired
	private FoodMapServiceDefIpl service;
	
	@PostMapping("/add")
	public String  addFood(@RequestBody  BeanRequest beans){
		return service.addFood(beans);
		//return f.getId()+" with id foodMap is created";
	}
	
	@PostMapping("/update")
	public String  updateFood(@RequestBody  BeanRequest beans){
		return service.updateFood(beans);
	}
	@GetMapping("/get")
	public List<FoodMap>  get(){
		return service.get();
	}
	@RequestMapping("/delete")
	public String  delete(@RequestBody  BeanRequest beans){
		return service.delete(beans);
	}


}
