package com.LSM.ch13_2;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Coin> coinBox = new Stack<Coin>();
		//코인클래스로 만든 객체만 들어올수 있는 stack 컬렉션 coinbox선언
		
		coinBox.push(new Coin(100)); //100원짜리 1개 생성후 코인박스에 넣음
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(800));
		coinBox.push(new Coin(700));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();//코인박스에서 동전 빼기
			System.out.println("꺼내온 동전" +coin.getValue());
		}
		
	}

}
