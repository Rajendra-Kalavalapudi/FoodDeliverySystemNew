package com.food.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.delivery.bean.FoodMap;

@RestController
@RequestMapping("/browse")
public class CatalogApiController {
	@Autowired
	 private CatalogServiceDefImpl service;
	 
	
	@RequestMapping("/catalog")
	public List<FoodMap> Catalog() {
		
		return service.catalog();
	}
}
