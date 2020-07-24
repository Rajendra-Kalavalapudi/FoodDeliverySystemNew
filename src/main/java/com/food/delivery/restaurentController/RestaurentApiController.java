package com.food.delivery.restaurentController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.bean.*;

@RestController
@RequestMapping("/rest")
public class RestaurentApiController {

	@Autowired
	private RestaurentServiceDefImpl service;
	
	@PostMapping("/add")
	public String  addFood(@RequestBody  BeanRequest beans){
		return service.addFood(beans);
	}
	
	@PostMapping("/update")
	public String  updateFood(@RequestBody  BeanRequest beans){
		return service.updateFood(beans);
	}
	@GetMapping("/get")
	public List<Restaurent>  get(){
		return service.get();
	}
	@RequestMapping("/delete")
	public String  delete(@RequestBody  BeanRequest beans){
		return service.delete(beans);
	}

}
