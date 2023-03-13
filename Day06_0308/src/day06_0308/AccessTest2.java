package day06_0308;

//같은 패키지내에 있는 클래스 생성 및 접근
public class AccessTest2 {

	public static void main(String[] args) {
		DTest dt1 = new DTest(); // 같은 패키지 내에 default 클래스는 생성 가능하다.
		dt1.m = 10;
		//dt1.n = 20;//private 변수는 다른 클래스에서 접근이 불가하다.
		CTest ct1 = new CTest();//같은 package 클래스의 생성자가 default라 접근 가능하다.
		//CTest ct2 = new CTest(10);// 같은 패키지라 할지라도 private 생성자는 객체 생성이 불가하다.
	}// main

}// AccessTest2