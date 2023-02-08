package com.streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
	
	    public static void main(String[] args) {  
	        List<Car> carsList = new ArrayList<Car>();  
	        //Adding Products  
	        carsList.add(new Car(1," Kia",250000f));  
	        carsList.add(new Car(2,"Thar",300000f));  
	        carsList.add(new Car(3,"Swift Desire",280000f));  
	        carsList.add(new Car(4,"Fortuner",2800000f));  
	         
	        List<Float> carPriceList2 =carsList.stream()  
	                                     .filter(c -> c.price > 30000)// filtering data  
	                                     .map(c->c.price)        // fetching price  
	                                     .collect(Collectors.toList()); // collecting as list  
	        System.out.println(carPriceList2);  
	    }  
	}  


