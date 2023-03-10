package day1_0227;

public class MathTest {
	public static void main (String[] args) {
		//Math.round() : 소숫점 첫째자리에서 반올림하여 정수로 변환
		float pi = 3.141592f;
//		System.out.println(Math.round(pi));

		
//		소수점 넷째자리에서 반올림하여 셋째자리까지만을 변환
		float p2 = Math.round(pi*1000)/1000f;
		System.out.println(p2);
		
	}
}
