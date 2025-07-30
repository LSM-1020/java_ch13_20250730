package com.LSM.ch13_1_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 //로그인 과정 구현
public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("tiger", "12345");
		map.put("lion", "88888");
		map.put("blackcat", "99999");
		map.put("whitedog", "77777");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디 : ");
			String id = scanner.nextLine();
			
			System.out.println("비밀번호 : ");
			String pw = scanner.nextLine();
			
			System.out.println("=======================");
			
		if (map.containsKey(id)) { 
		//map에 들어있는 데이터중 key값과 id값이 일치하는 값이 있으면 true를 반환
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
			}	else { //id값은 존재하나 해당 id의 비밀번호가 잘못됨
				System.out.println("비밀번호 잘못입력");
			}
		}else {
			System.out.println("입력하신 id가 존재하지 않습니다");
		}
	}

	}
}
