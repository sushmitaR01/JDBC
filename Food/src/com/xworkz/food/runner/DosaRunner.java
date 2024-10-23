package com.xworkz.food.runner;

public class DosaRunner {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.xworkz.food.boot.Dosa");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
			
		
		

	}

}
