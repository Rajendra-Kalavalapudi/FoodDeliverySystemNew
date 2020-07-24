package com.food.delivery.food;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.food.delivery.bean.*;

public interface FoodMapRepo extends CrudRepository<FoodMap, Long>{//JpaRepository<FoodMap, Long>{
//
	
	
	@Query(value="SELECT f.price FROM foodmap f WHERE f.rest_Id= :restId AND f.food_Id= :foodId",nativeQuery = true)
	  public  double findgetFoodPrice(@Param("foodId") Long foodId,@Param("restId")Long restId);
	

}
