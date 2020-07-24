package com.food.delivery.orderController;

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
import com.food.delivery.food.FoodMapRepo;

@Service
public class OrderServiceDefImpl {
	
	@Autowired
	private OrderRepo ordrepo;
	@Autowired
	private FoodMapRepo fdr;
	
	public String  addFood(@RequestBody  BeanRequest beans){
		Order f=new Order();
		f.setFoodId(1L);//ordrepo.findFoodId(beans.getFoodName()));
		f.setRestId(2L);//ordrepo.findRestId(beans.getRestaurentName()));
		//f.setFoodPrice(ordrepo.findPrice(f.getFoodId(), f.getRestId()).getPrice());
		double l=fdr.findgetFoodPrice(f.getFoodId(), f.getRestId());
	
			f.setFoodPrice(l);
		/*else
			f.setFoodPrice(0.0);*/
		f.setQuantity(beans.getQuantity());
		f.setCreateTs(new Date());
		f.setUpdateTs(new Date());
		ordrepo.save(f);
		return f.getId()+" with id order is created";
	}
	
	
	public String  updateFood(@RequestBody  BeanRequest beans){
		Order f=new Order();
		f.setId(beans.getId());
		f.setFoodId((ordrepo.findFoodId(beans.getFoodName())).getId());
		f.setRestId((ordrepo.findRestId(beans.getRestaurentName())).getId());
		double l=fdr.findgetFoodPrice(f.getFoodId(), f.getRestId());
		f.setFoodPrice(l);
		f.setQuantity(beans.getQuantity());
		f.setUpdateTs(new Date());
		ordrepo.save(f);
		return f.getId()+" with id order is update";
	}
	
	public List<Order>  get(){
		List<Order> list=new ArrayList<Order>();
		ordrepo.findAll().forEach(list::add);
		return list;
	}

	public String  delete(@RequestBody  BeanRequest beans){
		Order f=new Order();
		f.setId(beans.getId());
		ordrepo.deleteById(f.getId());
		return "deleted";
	}

}
