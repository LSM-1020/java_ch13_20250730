package com.LSM.ch13_1_quiz;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardDao() {
		List<Board> list = new ArrayList<Board>(); //list라는 큰 박스안에 설계도를 넣음 즉 board
		
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		
		return list;
	}
	
	
}
