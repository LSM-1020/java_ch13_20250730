package com.LSM.ch13_1_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set1 = new HashSet<String>();//set을 쓰면 중복을 제거한다
		
		set1.add("Jap");
		set1.add("Kor");
		set1.add("China");
		set1.add("USA");
		
		System.out.println(set1.size());
	
		set1.add("Jap");
		set1.add("China");
		set1.add("Rusia");
		
		System.out.println(set1.size()); 
		
		Iterator<String> iter = set1.iterator();	 //set1전용 iterator생성	
		//interator로 set에있는 처음부터 끝까지 하나씩 가져옴
			
		while(iter.hasNext()) {//boolean 타입, 다음 set요소가 있으면 true반환, 없으면 false
			String setstr = iter.next(); //iterator가 가르키는 요소를 찝어냄, set요소(객체)를 꺼내고 iterator 다음껄로이동
			System.out.println(setstr);
		}
		//향상된 for문
		for (String setstr : set1) {
			System.out.println(setstr);
		}
		if (set1.isEmpty()) { //true가 나오면 이 set안에는 요소가 없음 (비어있다)
			
		}
		
		//Iterator사용
		Iterator<String> iterator = set1.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
	}

}
