package com.food.delivery.restaurentController;

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
public class RestaurentServiceDefImpl {
		

	@Autowired
	private RestRepo rrepo;
	
	
	public String  addFood(@RequestBody  BeanRequest beans){
		Restaurent f=new Restaurent();
		f.setRestaurentName(beans.getFoodName());
		f.setDescription(beans.getDescription());
		f.setRating(beans.getRating());
		f.setLocation(beans.getLocation());
		f.setCreateTs(new Date());
		f.setUpdateTs(new Date());
		rrepo.save(f);
		return f.getId()+" with id food is created";
	}
	
	
	public String  updateFood(@RequestBody  BeanRequest beans){
		Restaurent f=new Restaurent();
		f.setId(beans.getId());
		f.setRestaurentName(beans.getFoodName());
		f.setDescription(beans.getDescription());
		f.setLocation(beans.getLocation());
		f.setRating(beans.getRating());
		f.setUpdateTs(new Date());
		rrepo.delete(f);
		return f.getId()+" with id food is delete";
	}
	
	public List<Restaurent>  get(){
		List<Restaurent> list=new ArrayList<Restaurent>();
		rrepo.findAll().forEach(list::add);
		return list;
	}
	@RequestMapping("/delete")
	public String  delete(@RequestBody  BeanRequest beans){
		Restaurent f=new Restaurent();
		f.setId(beans.getId());
		rrepo.deleteById(f.getId());
		return "deleted";
	}

}
