package com.food.delivery.orderController;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.food.delivery.bean.*;

public interface OrderRepo extends JpaRepository<Order, Long>  {
	
	//@Query("SELECT f FROM Foodmap f WHERE f.restId= :restId AND f.foodId= :foodId")
	  //public  FoodMap findPrice(@Param("foodId") Long foodId,@Param("restId")Long restId);
	
	@Query(value="SELECT * FROM food f WHERE f.food_name= :name",nativeQuery = true)
	  public Food findFoodId(@Param("name") String name);
	
	@Query(value="SELECT * FROM restaurent r WHERE r.rest_name= :name",nativeQuery = true)
	  public  Restaurent findRestId(@Param("name") String name);

}
