package com.food.delivery.food;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.food.delivery.bean.*;

@Service
public class FoodMapServiceDefIpl {
	@Autowired
	private FoodMapRepo fdmaprepo;
	
	public String  addFood(@RequestBody  BeanRequest beans){
		FoodMap f=new FoodMap();
		f.setFoodId(beans.getFoodId());
		f.setRestId(beans.getRestId());
		f.setPrice(beans.getPrice());
		f.setCreateTs(new Date());
		f.setUpdateTs(new Date());
		fdmaprepo.save(f);
		return f.getId()+" with id foodMap is created";
	}
	
	public String  updateFood(@RequestBody  BeanRequest beans){
		FoodMap f=new FoodMap();
		f.setFoodId(beans.getFoodId());
		f.setRestId(beans.getRestId());
		f.setPrice(beans.getPrice());
		f.setUpdateTs(new Date());
		fdmaprepo.delete(f);
		return f.getId()+" with id foodMap is update";
	}
	
	public List<FoodMap>  get(){
		List<FoodMap> list=new ArrayList<FoodMap>();
		fdmaprepo.findAll().forEach(list::add);
		return list;
	}
	
	public String  delete(@RequestBody  BeanRequest beans){
		FoodMap f=new FoodMap();
		f.setId(beans.getId());
		fdmaprepo.deleteById(f.getId());
		return "deleted";
	}


	

	
}
