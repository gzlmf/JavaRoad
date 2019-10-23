package com.demo;
import java.util.Scanner;
public class HireCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCar = 0;
		int[] carPick;
		int numPerson = 0;
		int numGood = 0;
		int cost = 0;
		int day = 0;
		String showPerson = "";
		String showGood = "";
		Car[] cars = {new Audi("奥迪A4", 500, 4),new MZD("马自达6", 400, 4),new PK("皮卡雪6", 450, 4, 20), new JL("金龙", 800, 20),new SLJ("松龙江", 400, 4),new YWK("依维柯", 1000, 20)};
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎使用租车系统\n您是否要租车？1是，0否");
		if(scanner.nextInt()==1) {
			System.out.println("序号  汽车名称  租金  容量");
			for(int i=0;i<cars.length;i++) {
				cars[i].printInfo(i+1);
			}
		}
		System.out.println("请输入租车数量");
		numCar = scanner.nextInt();
		carPick = new int[cars.length];
		for(int i=0;i<numCar;i++) {
			System.out.println("请输入第"+(i+1)+"辆车的序号");
			carPick[scanner.nextInt()-1] += 1;
		}
		for(int i=0;i<carPick.length;i++) {
			if(carPick[i] != 0 && cars[i] instanceof loadGood) {
				loadGood tmpGood = (loadGood)cars[i];
				numGood += tmpGood.getLoadGood() * carPick[i];
				showGood += " " + cars[i].getName();
				
			}
			if(carPick[i] != 0 && cars[i] instanceof loadPerson) {
				loadPerson tmpPerson = (loadPerson)cars[i];
				numPerson += tmpPerson.getLoadPer() * carPick[i];
				showPerson += " " + cars[i].getName();
			}
			cost += cars[i].getPrice() * carPick[i];
		}
		System.out.println("请输入租车天数");
		day = scanner.nextInt();
		cost *= day;
		System.out.println("可载货的车: "+ showGood +" 共载货: "+numGood);
		System.out.println("可载人的车: " + showPerson + " 共载人: "+ numPerson);
		System.out.println("总花费: " + cost);
	}

}
