package com.LSM.ch13_1_quiz2;

import java.util.Iterator;
import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberDao dao = new MemberDao();
		List<MemberDto> MemberInfo = dao.getMemberDao();
		
		Iterator<MemberDto> iterator = MemberInfo.iterator();
		
		while(iterator.hasNext()) {
			MemberDto info = iterator.next();
			System.out.println(info.getId() + " / " + info.getPw() + " / " + info.getName() + " / " + info.getEmail());
		}
	}

}
