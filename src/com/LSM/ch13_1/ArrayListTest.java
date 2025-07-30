package com.LSM.ch13_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<>();
		
		strList.add("Kor");
		strList.add("Jap");
		strList.add(1, "USA");
		
		strList.get(1); //빼내는 코드
		System.out.println(strList.get(0)); // 중간에 껴들면 한칸씩 밀림
		System.out.println(strList.get(1));
		System.out.println(strList.get(2));
		
		strList.remove(1); //지우는 코드
		System.out.println(strList.get(0));
		System.out.println(strList.get(1)); //지우면 한칸씩 땡겨짐 usa삭제되서 index2는 jap
//		System.out.println(strList.get(2)); 
	}

}
