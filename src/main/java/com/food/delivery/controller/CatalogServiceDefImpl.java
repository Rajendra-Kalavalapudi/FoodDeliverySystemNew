package com.food.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.food.delivery.bean.*;
import com.food.delivery.controller.*;
import com.food.delivery.food.FoodMapServiceDefIpl;
@Service
public class CatalogServiceDefImpl {
	@Autowired
	private FoodMapServiceDefIpl ser;
	public List<FoodMap> catalog(){
		List<FoodMap> list=null;
		return ser.get();
		
		
	}

}
