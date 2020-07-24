package com.food.delivery.foodController;

import org.springframework.data.repository.CrudRepository;

import com.food.delivery.bean.*;

public interface FoodRepo extends CrudRepository<Food, Long>{

}
