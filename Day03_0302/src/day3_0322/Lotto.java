package day3_0322;

public class Lotto {

	public static void main(String[] args) {
		// Math.random() double 타입
		/*
		 * for(int i=0; i<10; i++) { double random = Math.random();
		 * System.out.println(random); }
		 * 
		 * 0<= Math.random() <1 0*46 <= Math.random()*46+1 < 1*46+1 (int)1 <=
		 * (int)(Math.random()*46+1) < (int)47
		 */

		int[] ball = new int[46];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;// 1부터 시작하려면 +1해준다.

		} // for

		for (int i = 0; i < 100; i++) {
			// 어떤 변수에 있는 값을 바꿀 때는 임시 변수를 하나 둬야한다.
			int random1 = (int) (Math.random() * 46);// 0부터 45까지의 정수의 값을 가져오도록 하는 식
			int random2 = (int) (Math.random() * 46);

			if (random1 != random2) {//스와핑
				// 임시변수
				int temp = ball[random1];
				ball[random1] = ball[random2];
				ball[random2] = temp;
			} // if
		} // for

		System.out.println("====== [ L O T T O ] =====");
		for (int i = 0; i <= 6; i++) {
			System.out.print("[ " + ball[i] + " ] ");
		} // for

	}// main

}// Lotto