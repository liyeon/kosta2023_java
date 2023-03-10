package day2_0228;

public class WhileTest1 {

	public static void main(String[] args) {
		// 1부터 10까지의 합 구하기
		int sum = 0, i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);

		// 5의 배수의 합
		// 5를 나눈 나머지가 0일 때
		int d5tot = 0;
		i = 1;
		while (i <= 100) {
			if (i % 5 == 0) {
				d5tot += i;
			} // if 문 종료
			i++;
		} // while
		System.out.println(d5tot);
		
	}// main
}// WhileTest