package com.swagger.springboot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.springboot.model.Restaurant;

@RestController
public class SwaggerRestController {
	
	List<Restaurant> restaurants = new ArrayList<Restaurant>();
    {
    	restaurants.add(new Restaurant("Barbeque", 100, "Bangalore"));
    	restaurants.add(new Restaurant("Absolute Barbaque", 50, "Bangalore"));
    	restaurants.add(new Restaurant("Barbeque Nation", 100, "Hyderabad"));
    	restaurants.add(new Restaurant("Absolute Barbeque Nation", 50, "Hyderabad"));
    }
 
    @RequestMapping(value = "/getRestaurants")
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
 
    @RequestMapping(value = "/getRestaurant/{name}")
    public Restaurant getRestaurant(@PathVariable(value = "name") String name) {
    	System.out.println(restaurants.stream().findFirst());
        return restaurants.stream().filter(x -> x.getRestaurantName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
    }
 
    @RequestMapping(value = "/getRestaurantByLocation/{location}")
    public List<Restaurant> getRestaurantByLocation(@PathVariable(value = "location") String location) {
        System.out.println("Searching Restaurant in location : " + location);
        List<Restaurant> restaurantsByLocation = restaurants.stream().filter(x -> x.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
        System.out.println(restaurantsByLocation);
        return restaurantsByLocation;
    }
 
}
