package com.poker;

import java.util.Comparator;
import java.util.HashMap;

public class ComparePoker implements Comparator<Poker> {
	private HashMap<String, Integer> shapeMap = new HashMap<String, Integer>();
	private HashMap<String, Integer> numMap = new HashMap<String, Integer>();
	public ComparePoker() {
		// TODO Auto-generated constructor stub
		shapeMap.put("黑桃",1);
		shapeMap.put("红心",2);
		shapeMap.put("梅花",3);
		shapeMap.put("方块",4);
		numMap.put("A",1);
		numMap.put("2",2);
		numMap.put("3",3);
		numMap.put("4",4);
		numMap.put("5",5);
		numMap.put("6",6);
		numMap.put("7",7);
		numMap.put("8",8);
		numMap.put("9",9);
		numMap.put("10",10);
		numMap.put("J",11);
		numMap.put("Q",12);
		numMap.put("K",13);
		
	}
	@Override
	public int compare(Poker poker1, Poker poker2) {
		// TODO Auto-generated method stub
		int shape1 = shapeMap.get(poker1.getShape());
		int shape2 = shapeMap.get(poker2.getShape());
		int num1 =numMap.get(poker1.getNum());
		int num2 = numMap.get(poker2.getNum());
		if(num1>num2) {
			return -1;
		}else if (num1<num2) {
			return 1;
		}else {
			if(shape1<shape2) {
				return -1;
			}
			else if (shape1 > shape2) {
				return 1;
			}else {
				return 0;
			}
		}
	}

}
