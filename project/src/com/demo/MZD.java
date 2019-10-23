package com.demo;

public class MZD extends Car implements loadPerson{
	private double loadPer;
	public MZD(String name, double price, double loadPer) {
		super(name, price);
		// TODO Auto-generated constructor stub
		this.setLoadPer(loadPer);
	}	
	@Override
	public void printInfo(int i) {
		// TODO Auto-generated method stub
		System.out.println(i + ". 马自达6 " + this.getPrice() + "元一天" + "载人：" + this.getLoadPer());
	}
	@Override
	public double getLoadPer() {
		// TODO Auto-generated method stub
		return loadPer;
	}
	@Override
	public void setLoadPer(double loadPer) {
		// TODO Auto-generated method stub
		this.loadPer = loadPer;
	}

}
