package com.demo;

public class SLJ extends Car implements loadGood{
	private double load;
	public SLJ(String name, double price,double load) {
		super(name, price);
		// TODO Auto-generated constructor stub
		this.setLoadGood(load);
	}
	@Override
	public void printInfo(int i) {
		// TODO Auto-generated method stub
		System.out.println(i + ". 松龙江 " + this.getPrice() + "元一天" + "载货：" + this.getLoadGood() + "吨");
	}
	@Override
	public double getLoadGood() {
		// TODO Auto-generated method stub
		return load;
	}
	@Override
	public void setLoadGood(double loadGood) {
		// TODO Auto-generated method stub
		this.load = loadGood;
	}
}
