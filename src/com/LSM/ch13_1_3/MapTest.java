package com.LSM.ch13_1_3;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, String> map1 = new HashMap<String, String>(); // 기본타입은 못들어가고 클래스만
		
		map1.put("이름", "홍길동"); //put-> 데이터 삽입
		map1.put("직업", "개발자");
		map1.put("성별", "남자");
		
		System.out.println(map1.get("이름"));
		System.out.println(map1.get("직업"));
		System.out.println(map1.get("성별"));
		//array는 value만 불러들일수있고 map은 key를 알면 value을 같이 불러들일수 있다
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("홍길동", 90);
		map2.put("이순신", 80);
		map2.put("김유신", 70);
		map2.put("강감찬", 75);
		map2.put("강감찬", 85); // 강감찬 점수 85로 수정
		
	}

}
