package com.demo;

public abstract class Car {
	private String name;
	private double price;
	public Car(String name,double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public abstract void printInfo(int i);
}
