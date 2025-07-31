package com.LSM.ch13_1_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;//최고점수를 받은 아이디가 저장될 변수
		int maxSore = 0;// 최고 점수가 저장될 변수
		int totalScore = 0; //점수의 총합이 저장될 변수
		
		//<iterator이용>
		Iterator<Map.Entry<String, Integer>> iter=map.entrySet().iterator();
		//키,값 한쌍에 대해서는 iterator사용
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
			//<향상된 for문 사용>
			Set<Map.Entry<String, Integer>> entry2 = map.entrySet();
			for(Map.Entry<String, Integer> entry : entry2) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
				
			}
		
		
		
	}

}
