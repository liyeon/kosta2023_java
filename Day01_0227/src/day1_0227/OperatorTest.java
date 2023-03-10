package day1_0227;

public class OperatorTest {

	public static void main(String[] args) {

		int n = 10, m = 10; //동일한 타입은 콤마로 구분하기도 함
		
		int r = ++n;
		System.out.println(r);
		System.out.println(n);
		
		int r2 = m++;
		
		System.out.println(r2);
		System.out.println(m);
		
		System.out.println(n++);
		System.out.println(++m);
		System.out.println(n);
		
		
		byte a = 10, b = 20;
		byte c1 = (byte) (a+b);
		int c2 = a+b;
		
	}

}
