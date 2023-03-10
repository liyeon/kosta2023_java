package day4_0303;



public class MethodTest1 {
	
	public static void func1() { //method 의 정의
		int n=10;
		System.out.println(n);
		func2();
		System.out.println("func1종료");
	}//func1
	
	public static void func2() {
		int n=10;
		System.out.println(n);
		System.out.println("func2종료");//return
	}//func2
	
	
	//함수는 호출해야 그제서야 실행이 된다. 
	//순서와 상관 없이 main 부터 실행되고 다른 메소드들은 호출이 되지 않으면 실행되지 않는다.
	public static void main(String[] args) { // void = 아무것도 리턴하지 않는다.
		int n =30;
		System.out.println(n);
		func1();//메소드의 호출
		System.out.println("main 종료");

	}//

}//