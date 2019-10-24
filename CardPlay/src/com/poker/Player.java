package com.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Player {
	private int playerId;
	private String playerName;
	public ArrayList<Poker> handList = new ArrayList<Poker>();
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public void receiveCard(Poker poker) {
		this.handList.add(poker);
	}
	public Poker findMax() {
		ComparePoker comparePoker = new ComparePoker();
		Collections.sort(this.handList, comparePoker);
		return this.handList.get(0);
	}
	public void showHand() {
		for(Poker poker:this.handList) {
			System.out.print(poker.getNum()+poker.getShape() + " ");
		}
	}
}
