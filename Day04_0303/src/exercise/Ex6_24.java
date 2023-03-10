package exercise;

public class Ex6_24 {
	static int abs(int data) {
		//삼항 연산자
		return data >= 0 ? data : -data;

	}// static abs

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	}//

}//