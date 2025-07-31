package com.LSM.ch13_1_quiz;

public class MaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아래 배열요소중 최고 점수를 출력하시오
		int[] scores =  {86, 96, 92};
		int sum = 0;
		int maxScore = 0;
		
		for(int score: scores) {
			if(score > maxScore) {
				maxScore = score; //score가 값이 더 크면 즉 maxscore가 되는것이기 때문
				}
		}
		System.out.println(maxScore);
		
	
//		for(int score2: scores) {
//			sum = score2 + sum;
//			
//		}
//		System.out.println(sum);
	}

}
