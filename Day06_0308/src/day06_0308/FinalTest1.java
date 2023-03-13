package day06_0308;

class Test {
	final int NUM;
	//instance final 변수는 생성자에서 초기화해야한다.
	//명시적 초기화도 가능하지만 그럴 경우 모든 객체들이 같은 상수 값을 사용해야만 한다.
	Test(int n){
		NUM=n;
	}//생성자
	
//	void setNum(int num) {//final 변수는 변경 불가능하다.
//		NUM=num
//	}
}//Test

final class Test2{}

//class Test3 extends Test2{}//final class는 상속 불가하다.

class Test4{
	final void method() {
		
	}
}

class Test5 extends Test4{
	//void method() {} // final method override 불가
}

public class FinalTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int n;
		n=10;
		// 초기화는 한번만 가능하고 이후에는 변경으로 간주되어 불가하다..//n=20;
	}//main

}//class FinalTest