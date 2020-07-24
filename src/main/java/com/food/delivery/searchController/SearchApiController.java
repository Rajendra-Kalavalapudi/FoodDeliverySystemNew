package com.food.delivery.searchController;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.bean.*;

@RestController
public class SearchApiController {
	
	@Autowired
	private SearchRestaurantServiceImpl srch;
	
	@RequestMapping("/search")
	public List<FoodMap> find(@RequestParam int rating,@RequestParam double price) {
		return srch.findrest(rating, price);
	}

}
