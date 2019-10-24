package com.demo;

public class PK extends Car implements loadPerson, loadGood{
	private double loadPer;
	private double loadGood;
	public PK(String name, double price, double loadPer,double loadGood) {
		super(name, price);
		// TODO Auto-generated constructor stub
		this.setLoadGood(loadGood);
		this.setLoadPer(loadPer);
	}
	public double getLoadPer() {
		return loadPer;
	}
	public void setLoadPer(double loadPer) {
		this.loadPer = loadPer;
	}
	public double getLoadGood() {
		return loadGood;
	}
	public void setLoadGood(double loadGood) {
		this.loadGood = loadGood;
	}
	
	@Override
	public void printInfo(int i) {
		// TODO Auto-generated method stub
		System.out.println(i + ". 皮卡雪6 " + this.getPrice() + "元一天" + "载人：" + this.getLoadPer() + "载货："+ this.getLoadGood());
	}
}
