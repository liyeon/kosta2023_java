package day2_0228;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//구구단
		
		int dan, i=1;
		while(i<=9) {
			dan=2;//초기화
			while(dan<=9) {
				System.out.print(dan + " x " + i + " = " + dan * i+"\t");
				dan++;
			}//while
			System.out.println();
			i++;
			
		}//while
	
	}//main

}//WhileTest2