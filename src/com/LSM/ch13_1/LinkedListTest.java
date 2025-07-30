package com.LSM.ch13_1;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Board> list1 = new ArrayList<Board>();
		List<Board> list2 = new LinkedList<Board>();
		
		Date nowDate = new Date();
		
		Board board = new Board("강감찬","안녕하세요","첫글입니다",new Timestamp(nowDate.getTime()));
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			
			list1.add(board);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 작업시간: " + (endTime - startTime));
		
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			
			list2.add(board);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 작업시간: " + (endTime - startTime));
	}

}
