package day4_0303;

//class MyMath{
//	long add(long a, long b) {//반환해야 할 값이 있는 경우
//		long result = a+b;
//		return result;//return 해준다.
//	}
//}//

public class MethodTest2 {
	//객체생성없이 생성되는 메소드
	static long  add(long a, long b) {//반환해야 할 값이 있는 경우
		long result = a+b;
		a = 100;
		b =200;
		return result;//return 해준다.
	}
	public static void main(String[] args) {
		
		MethodTest2 mm = new MethodTest2();
		int a=10, b=20;
//		MyMath mm = new MyMath();
		long sum = MethodTest2.add(a, b);
		System.out.println(sum);
		System.out.println(a);
		System.out.println(b);
	}//
}//