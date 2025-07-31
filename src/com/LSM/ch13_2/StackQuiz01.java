package com.LSM.ch13_2;
//문자열 뒤집기: Hello문자열을 거꾸로 출력하시오
//char stack
import java.util.Stack;

public class StackQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> str = new Stack<String>();
		str.push(new String("H"));
		str.push(new String("e"));
		str.push(new String("l"));
		str.push(new String("l"));
		str.push(new String("o"));
		
		while(!str.isEmpty()) {
			String word = str.pop();
			System.out.print(word);
		}
		System.out.println("============================");
		
		
		String str1 = "Hello";
		Stack<Character> strStack = new Stack<Character>();
		
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			strStack.push(ch);
		}
		while(!str1.isEmpty()) {
			
			System.out.print(strStack.pop());
		
		
		
		}
		
	}

}
