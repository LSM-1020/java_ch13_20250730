package com.LSM.ch13_1_quiz;

import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BoardDao dao = new BoardDao();
		List<Board> boardlist = dao.getBoardDao(); //List는 dao.getboarddao의 회원 정보를 차례차례 정리해서 저장함
		
		Iterator<Board> iterator = boardlist.iterator(); 
		
		while(iterator.hasNext()) {//while문 true면 다음줄 실행됨		
		Board board = iterator.next();//while문 false면 종료		
		System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
