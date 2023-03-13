package test.main;

//다형성
public class PolinoTest1 {
	
	public static void main(String[] args) {
		SpecialAccount sacc = new SpecialAccount("1001", "홍길동", 10000, "VIP");
		
		sacc.deposit(10000);
		System.out.println(sacc.info());
		
		sacc.withdraw(5000);
		System.out.println(sacc.info());
		
		
		// upCasting ( 자식 객체를 부모타입의 변수에 할당한다.)
		//
		Account acc = new SpecialAccount("1002", "김도봉", 200000, "GOLD");
		//String grade = acc.getGrade();//부모타입의 변수로 자식이 가지고 있는 속성과 메소드에 접근할수없다.
		
		//부모 타입의 레퍼런스(참조) 라 하더라도 자식 객체를 담고 있으면 오버라이딩한 자식의 메소드를 호출한다. 이를 다형성이라함 
		System.out.println(acc.info());//오버라이딩 했기때문에 자식이 호출됨
		
		//부모는 자식에 담을 수 없음
		Account acc2 = new Account("1003", "차차차", 300000);
		
		//다형성이라는 용어를 가지고 풀어내기엔느 어렵다.
	}// main

}// 클래스 종료