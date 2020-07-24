package com.food.delivery.bean;

import java.util.*;


public class BeanRequest {
	
	 public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	Long id;
	Long foodId;
	Long restId;
	double price;
	String restaurentName;
	Long rating;
	String location;
	Long quantity;
	
	
	
	String foodName;
	 String description;
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFoodId() {
		return foodId;
	}
	public void setFoodId(Long foodId) {
		this.foodId = foodId;
	}
	public Long getRestId() {
		return restId;
	}
	public void setRestId(Long restId) {
		this.restId = restId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRestaurentName() {
		return restaurentName;
	}
	public void setRestaurentName(String restaurentName) {
		this.restaurentName = restaurentName;
	}
	public Long getRating() {
		return rating;
	}
	public void setRating(Long rating) {
		this.rating = rating;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	
	
	


}
