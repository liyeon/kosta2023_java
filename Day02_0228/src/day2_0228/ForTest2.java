package day2_0228;

public class ForTest2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.println("============ " + i + "단 ===========");
			for (int n = 1; n <= 9; n++) {
				System.out.println(i + "x" + n + "=" + n * i);
			} // for문 n
		} // for문 i
		
		
		for (int dan = 2; dan <= 9; dan++) {
			//시스템 클래스의 아웃 개체 안에 있는 print의 ln은 라인을 밑으로 내려준다.
			System.out.println(System.lineSeparator()+" === " + dan + " 단 ");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i + " = " + dan * i);
			} // for문 종료
		}//dan for문
		
		
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(System.lineSeparator()+" === " + dan + " 단 ");
			for (int i = 1; i <= 9; i++) {
				System.out.print(dan + " x " + i + " = " + dan * i+"\t");
			} // for문 종료
		}//dan for문
		
		
		
		
	}//main
}//ForTest2