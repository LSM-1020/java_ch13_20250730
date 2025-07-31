package com.LSM.ch13_2;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack1 = new Stack<String>(); //stack은 클래스로 선언
		
		stack1.push("1) kor");
		stack1.push("2) jap");
		stack1.push("3) usa");
		//몇개가 있는지는 모르는 경우가 많기에 while로 처리
		while(!stack1.isEmpty()) { //isEmpty() -> stack이 비어있으면 true->비어있지 않으면 참이되게 ! 붙임
			String str = stack1.pop();
			System.out.println(str);
			
		}
		
	}

}
