package day4_0303;

class TestClass {
	int iv;
	static int sv;

	void ifunc() {
		iv = 10;// instance 메소드에서는 인스턴스 변수에 접근 가능한다.
		sv = 200;// 인스턴스 메소드에서는 static 변수에 접근 가능하다.
		sfunc();// 인스턴스 메소드에서는 static 메소드에 접근 가능하다
	}// func

	static void sfunc() {
		// static method 에서는 인스턴스 변수에 접근이 불가능하다.
		// iv = 20; // 같은 클래스 안에 있어도 불가능하다.
		// ifunc(); static method에서는 인스턴스 메소드 호출이 불가능하다.

		// 클래스가 로드된 시점에 생성 됐기 때문에 가능
		sv = 200;// static 메소드에서는 static 변수에 접근 가능하다.
	}// sfunc
}// TestClass

public class StaticTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass.sv = 100; // static 변수는 클래스 이름으로 접근한다.
		TestClass.sfunc();// static method는 클래스 이름으로 접근한디

		TestClass t = new TestClass();
		t.iv = 2;// instatce 변수는 객체 생성 후 레퍼런스(참조)를 통해 접근한다.

		t.ifunc(); // instance method 는 객체 생성 후 (레퍼런스)참조를 통해 접근한다.
	}//

}//