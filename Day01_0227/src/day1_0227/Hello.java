package day1_0227;

public class Hello {
	
	boolean b3; // 초기화 선언

	public static void main(String[] args) {
		
		//문자형
		char ch; //변수의 선언
		ch = 'A';//변수의 초기화(= 값의 할당), char 타입에는 반드시 작은 따옴표로 값을 묶어야한다.
		/*
			한 글자만 들어가야함
			A라는 캐릭터를 ch라는 변수에 할당함
			char ch = 'A';// 데이터타입 변수명 
		*/
		//정수 1 byte당 127 저장 가능
		byte b = 10;//정수 1byte 8bit 127이상 저장 불가
		short s = 10;//정수 2byte 16bit
		int n = 10;//4byte 32bit
		long l = 10;//8byte 64bit
		
		//실수
		
		String str = "A"; // null은 0임
		//모든 문자열의 끝은 null임 그래서 초기화를 안해줘도된다.
		
	//		System.out.println("HELLO JAVA");
		
		boolean b3;
		char ch2 = ' ';
		String str2 = "";
		
		int n2 = 10+20; //30;
		System.out.println("n2의 값은 : " + n2);

	}

}
