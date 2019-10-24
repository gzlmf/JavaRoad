package com.poker;

public class Poker {
	
	private String shape;
	private String num;
	
	public Poker(String shape,String num) {
		this.shape = shape;
		this.num = num;
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String type) {
		this.shape = type;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
}
