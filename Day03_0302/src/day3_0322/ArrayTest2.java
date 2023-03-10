package day3_0322;

public class ArrayTest2 {

	public static void main(String[] args) {

		int[] score = {98, 85, 77, 89, 100};
		
		//평균 구하기
		
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<score.length; i++) {//index 는 <=X
			sum += score[i];
		}//for
		
		avg = (double)sum / score.length;
		
		System.out.println("합 : "+sum+" 평균 : "+avg);
		
	}//main

}//ArrayTest2