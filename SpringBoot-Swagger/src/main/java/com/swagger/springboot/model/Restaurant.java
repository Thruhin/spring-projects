package com.swagger.springboot.model;

public class Restaurant {
	
	public Restaurant(String restaurantName, int processingCapacity, String location){
		this.restaurantName=restaurantName;
		this.processingCapacity=processingCapacity;
		this.location=location;
	}
	
	private String restaurantName;
	
	private int processingCapacity;
	
	private int currentlyProcessing;
	
	private String location;
	
	
	
	
	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public int getProcessingCapacity() {
		return processingCapacity;
	}

	public void setProcessingCapacity(int processingCapacity) {
		if(processingCapacity < 0){
			this.processingCapacity = 1;
		}else{
		this.processingCapacity = processingCapacity;
		}
	}

	public int getCurrentlyProcessing() {
		return currentlyProcessing;
	}

	public void setCurrentlyProcessing(int currentlyProcessing) {
		this.currentlyProcessing = currentlyProcessing;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
    public String toString() {
        return "Restaurant [name=" + restaurantName + ", capacity=" + processingCapacity + ", location=" + location + "]";
    }

}
