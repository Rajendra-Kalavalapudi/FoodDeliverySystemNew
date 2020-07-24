package com.food.delivery.foodController;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.food.delivery.bean.*;

@RestController
@RequestMapping("/food")
public class FoodApiController {
	
	
	@Autowired
	private FoodServiceDefImpl service;
	
	@PostMapping("/add")
	public String  addFood(@RequestBody  BeanRequest beans){
		return service.addFood(beans);
	}
	
	@PostMapping("/update")
	public String  updateFood(@RequestBody  BeanRequest beans){
		return service.updateFood(beans);
	}
	@GetMapping("/get")
	public List<Food>  get(){
		return service.get();
	}
	
	@RequestMapping("/delete")
	public String  delete(@RequestBody  BeanRequest beans){
		return service.delete(beans);
	}
}
