package day4_0303;

class MyClass {
	int in;//객체 생성시, 즉 new MyClass() 할 때마다 생성된다.
	static int sn;//힙 영역에 들어가지 않음 static(class)변수는 클래스가 로드 될 때 메모리를 생성한다. (method area에)
}// class

public class StaticTest {

	public static void main(String[] args) {
		
		MyClass.sn = 100;
		
		System.out.println(MyClass.sn);
		
		MyClass mc1 = new MyClass();
		mc1.in=10;
		mc1.sn=200;
		
		MyClass mc2 = new MyClass();
		
		System.out.println(mc2.in);
		System.err.println(mc2.sn);
		
	}// main

}// StaticTest