package day06_0308;
//다른 패키지에 있는 클래스 생성 및 접근
import pac.ATest;

//class ATest{//public 사용 시 에러남
//하나의 클래스에만 public 을 사용 할 수 있다.
//main이 속해있는 클래스에는 반드시 pulic을 붙여야한다.
//}//
//접근제어자
public class AccessTest1 {

	public static void main(String[] args) {
		ATest at1 = new ATest();// public 이기 때문에 접근은 가능하나 생성자는 default이기 때문에 에러가 난다.
		/*
		 * ATest at2 = new ATest(10); // 다른 package에 있는 클래스의 생성자가 default일 경우 객체 생성이
		 * 불가하다. BTest bt1 = new BTest();//default 클래스는 같은 package에서만 사용 가능하다. at1.n=10;
		 * //다른 package에 있는 클래스의 default 변수는 접근 불가하다.
		 * 
		 * at1.method(); // 다른 package에 있는 클래스의 default메소드 호출 불가
		 */
		at1.setN(10); // 다른 클래스의 변수는 set, get method를 통해 접근해야한다.
		int n = at1.getN();
		
		//일반적으로 변수는 정보은닉을 하기 때문에 일반적으로 private 으로 설정되기 때문에 getter와 setter를 이용하여 접근한다.  
		at1.m = 100; // 다른 package라 할지라도 public 변수에는 접근이 가능하다.
		
		//일반적으로 메소드는 public 이나 default이다. 
		at1.method2();
	}// main

}// class