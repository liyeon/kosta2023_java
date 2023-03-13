//패키지
package day06_0308;

class Base {
	int bnum;

	// 기본 생성자
	Base() {
		System.out.println("Base()");
	}

	Base(int num) {
		bnum = num;
		System.out.println("Base(int num)");
	}// 생성자
	
	//
	void method1() {
		System.out.println("method1");
	}//method1
	
}// class Base

class Derived extends Base {
	int dnum;
	/*
	 * 1. 자식 클래스가 생성자를 만들지 않으면 자식의 기본 생성자가 자동 생성되고 부모의 기본 생성자를 호출한다.
	 */

	Derived() {
		System.out.println("Deriver()");
	}//

	Derived(int num) {
		dnum = num;
		System.out.println("Derived(int num)");
	}// 생성자

	Derived(int bnum, int dnum) {
		// 부모가 초기화 하게끔
		super(bnum);// 부모의 생성자를 통해 부모의 변수를 초기화한다.
		// this.bnum=bnum; //부모의 기본 생성자 호출 후 자식이 부모의 변수를 초기화 한다.
		this.dnum = dnum;
		System.out.println("Derived(int bnum, int dnum);");
	}// 생성자
	
	//함수명과 매개변수가 똑같으면 오버라이딩에 해당된다.
	//overriding : 부모의 메소드와 함수명의 파라미터가 같다.
	//자식은 부모걸 무시하고 자식걸 받아온다.
	//@Override//@= 어노테이션 컴파일C를 대신 해준다.
	void method1() {
		//부모의 메소드를 보강하기 위해
		//자식과 부모가 같은 메소드를 가지고 있을 때 부모를 명시적으로 표현해ㅐ주기 위해
		super.method1();
		System.out.println("derived method1");
	}
	
	void method1(int n) {//함수명은 같지만 변수가 다르기 때문에 오버로딩에 해당ㄴ된다.
		System.out.println("derived method1");
	}
	
	void method2() {
		System.out.println("method2");
	}
}// class Derived

public class InheritTest2 {

	public static void main(String[] args) {
		Derived d1 = new Derived();
		Derived d2 = new Derived(100);
		Derived d3 = new Derived(100, 200);
		
		
		d3.method1();
		d3.method2();
	}// main

}// class