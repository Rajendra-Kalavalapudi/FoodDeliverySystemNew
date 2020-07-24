package com.food.delivery.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="foodmap")
public class FoodMap {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	Long foodId;
	Long restId;
	double price;
	Date createTs;
	Date updateTs;
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
	public Date getCreateTs() {
		return createTs;
	}
	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}
	public Date getUpdateTs() {
		return updateTs;
	}
	public void setUpdateTs(Date updateTs) {
		this.updateTs = updateTs;
	}
}
