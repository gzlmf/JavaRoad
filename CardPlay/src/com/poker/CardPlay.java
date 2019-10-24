package com.poker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CardPlay {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		CardPlay cardPlay = new CardPlay();
		ArrayList<Poker> pokerSet = cardPlay.createPoker();
		Player player1 = new Player();
		System.out.println("请输入第1位玩家的ID和姓名:");
		while(flag) {
			System.out.println("输入ID：");
			try {
				player1.setPlayerId(scanner.nextInt());
				flag = false;
			}catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("请输入整数类型的ID！");
				scanner.next();
				continue;
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("未知错误");
				continue;
			}
		}
		System.out.println("输入名字：");
		player1.setPlayerName(scanner.next());
		Player player2 = new Player();
		System.out.println("请输入第2位玩家的ID和姓名:");
		flag = true;
		while(flag) {
			System.out.println("输入ID：");
			try {
				player2.setPlayerId(scanner.nextInt());
				flag = false;
			}catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("请输入整数类型的ID！");
				scanner.next();
				continue;
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("未知错误");
				continue;
			}
		}
		System.out.println("输入名字：");
		player2.setPlayerName(scanner.next());
		
		System.out.println("欢迎玩家："+player1.getPlayerName());
		System.out.println("欢迎玩家："+player2.getPlayerName());
		System.out.println("开始发牌");
		System.out.println("玩家："+player1.getPlayerName()+"拿牌");
		player1.receiveCard(pokerSet.get(0));
		System.out.println("玩家："+player2.getPlayerName()+"拿牌");
		player2.receiveCard(pokerSet.get(1));
		System.out.println("玩家："+player1.getPlayerName()+"拿牌");
		player1.receiveCard(pokerSet.get(2));
		System.out.println("玩家："+player2.getPlayerName()+"拿牌");
		player2.receiveCard(pokerSet.get(3));
		
		System.out.println("---------------发牌结束-----------------");
		System.out.println("---------------开始游戏-----------------");
		Poker player1Poker = player1.findMax();
		System.out.println("玩家："+player1.getPlayerName()+"最大的手牌是："+player1Poker.getShape()+player1Poker.getNum());
		Poker player2Poker = player2.findMax();
		System.out.println("玩家："+player2.getPlayerName()+"最大的手牌是："+player2Poker.getShape()+player2Poker.getNum());
		
		if (cardPlay.checkPoker(player1Poker, player2Poker)) {
			System.out.println("---------------玩家:" + player1.getPlayerName() + "获胜！---------------------");
		}else {
			System.out.println("---------------玩家:" + player2.getPlayerName() + "获胜！---------------------");
		}
		
		System.out.println("玩家各自的手牌为：");
		System.out.print("Tom:");
		player1.showHand();
		System.out.println();
		System.out.print("Jack:");
		player2.showHand();
		
	} 
	
	Boolean checkPoker(Poker poker1, Poker poker2) {
		HashMap<String, Integer> shapeMap = new HashMap<String, Integer>();
		HashMap<String, Integer> numMap = new HashMap<String, Integer>();
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
		if(numMap.get(poker1.getNum()) > numMap.get(poker2.getNum())){
			return true; //1比2大
		}else if(numMap.get(poker1.getNum()) > numMap.get(poker2.getNum())) {
			return false;//1比2小
		}else {
			if(shapeMap.get(poker1.getShape()) < shapeMap.get(poker2.getShape())) {
				return true;
			}else {
				return false;
			}
		}
	}
	
	ArrayList<Poker> createPoker(){
		PokerCreator pokerCreator = new PokerCreator();
		pokerCreator.showPoker();
		pokerCreator.washPoker();
		pokerCreator.showPoker();
		return pokerCreator.getPoker();
	}
}
