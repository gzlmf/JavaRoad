package com.demo;

public class JL extends Car implements loadPerson{
	private double load;
	public JL(String name, double price,double load) {
		super(name, price);
		// TODO Auto-generated constructor stub
		this.setLoadPer(load);
	}
	
	@Override
	public void printInfo(int i) {
		// TODO Auto-generated method stub
		System.out.println(i + ". 金龙 " + this.getPrice() + "元一天" + "载人：" + this.getLoadPer());
	}
	@Override
	public double getLoadPer() {
		// TODO Auto-generated method stub
		return load;
	}
	@Override
	public void setLoadPer(double loadPer) {
		// TODO Auto-generated method stub
		this.load = loadPer;
	}
}
