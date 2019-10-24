package com.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;


public class PokerCreator{
	private ArrayList<Poker> pokerlist;
	private HashMap<Integer, String> shapelist = new HashMap<Integer, String>();
	public PokerCreator() {
		System.out.println("------------------创建扑克牌...--------------------");
		pokerlist = new ArrayList<Poker>();
		shapelist.put(1, "黑桃");
		shapelist.put(2, "红心");
		shapelist.put(3, "梅花");
		shapelist.put(4, "方块");
		this.createPoker();
	}
	
	private void createPoker(){
		System.out.println("----------------------扑克牌创建成功-----------------------");
		String shapetmp;
		for(int i=1;i<=4;i++) {
			shapetmp = this.shapelist.get(i);
			this.pokerlist.add(new Poker(shapetmp, "A"));
			for(int j=2; j<11;j++) {
				this.pokerlist.add(new Poker(shapetmp, String.valueOf(j)));
			}
			this.pokerlist.add(new Poker(shapetmp, "J"));
			this.pokerlist.add(new Poker(shapetmp, "Q"));
			this.pokerlist.add(new Poker(shapetmp, "K"));
		}
	}
	public void showPoker() {
		System.out.print("为：[");
		for(Poker poker:this.pokerlist) {
			System.out.print(poker.getShape()+poker.getNum()+" ");
		}
		System.out.println("]");
		
	}
	public void washPoker() {
		//创建随机序列
		System.out.println("-------------------开始洗牌---------------------");
		Collections.shuffle(this.pokerlist);
		System.out.println("-------------------洗牌结束-------------------------");
	}
	public ArrayList<Poker> getPoker(){
		return this.pokerlist;
	}
}
