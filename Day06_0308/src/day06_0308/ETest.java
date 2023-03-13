package day06_0308;

import pac.ATest;

public class ETest extends ATest {
	void method3() {
		//protected 패키지가 다르더라도 자식은 접근 가능하다.
		System.out.println(n);//부모의 n은 default라 다른 패키지인 곳에서는 접근이 불가하다.
	}
}