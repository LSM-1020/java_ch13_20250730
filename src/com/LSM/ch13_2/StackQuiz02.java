package com.LSM.ch13_2;

import java.util.Stack;

// (())()) ->유효한 괄호인지 아닌지 출력하는 프로그램을 만드시오
public class StackQuiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(())())";
		
		Stack<Character> strStack = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch == '(') {
				strStack.push(ch);
			} else {
				if(strStack.isEmpty()) {
					System.out.println("유효하지 않은 괄호 구성입니다");
					break;
				}
				strStack.pop(); //들어온 ')'의 짝이 추출됨
			}
			
		}
			if(strStack.isEmpty()) {
				System.out.println("유효한 괄호 구성입니다");
			}else {
				System.out.println("유효하지 않은 괄호 구성입니다");
			}
	
	
	
	}

}

//0	(	(	여는 괄호 → push
//1	(	((	여는 괄호 → push
//2	)	(	닫는 괄호 → 쌓이는문이 실행되지 않고 빠지는 문이 실행되어 pop 하나 제거
//3	)	(empty)	닫는 괄호 → pop 하나 제거
//4	(	(	여는 괄호 → push
//5	)	(empty)	닫는 괄호 → pop 하나 제거
//6	)	❌	스택이 비었는데 닫는 괄호 → 오류!
