package com.LSM.ch13_1;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Board> boardList = new ArrayList<Board>(); //boardList를 가져올 클래스 이름 넣기
		Date nowDate = new Date(); //현재 오늘 날짜
		
		//방법1 index0
		Board board1 = new Board();
		board1.setWriter("홍길동");
		board1.setSubject("안녕하세요");
		board1.setContent("인사드립니다");
		board1.setDate(new Timestamp(nowDate.getTime()));
		boardList.add(board1);

		//방법2 바로 생성 index1
		boardList.add(new Board("이순신","저는 이순신입니다","저는 조선의 해군입니다",new Timestamp(nowDate.getTime())));
		
		//방법3 index2
		Board board2 = new Board("김유신","저는 김유신입니다","저는 신라의 장군입니다",new Timestamp(nowDate.getTime()));
		boardList.add(board2);
		
		System.out.println("    제 목    /   글내용   /   글쓴이   /   글쓴날짜  ");
		for(int i=0;i<boardList.size();i++) { //arraylist는 length가 아니라 size로 나타냄
			Board board = boardList.get(i);
			System.out.println(board.getSubject()+ "/" + board.getContent() + "/" + board.getWriter() + "/" + board.getDate());
		}
	}	
}
