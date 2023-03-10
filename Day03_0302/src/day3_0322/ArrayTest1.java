package day3_0322;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 변수를 선언(초기화)한다.
		int[] narr1 = new int[5];
//		int [] narr1;
//		narr = new int[5];

		narr1[0] = 10;
		narr1[1] = 20;
		narr1[2] = 30;
		narr1[3] = 40;
		narr1[4] = 50;

		// ==배열 한 라인으로 초기화하기
		// 배열을 생성과 동시에 초기화 할 시에는 배열의 갯수를 생략해야함
//		int[] narr2 = new int [] {10, 20, 30, 40, 50}; 
		int[] narr2;
		narr2 = new int[] { 10, 20, 30, 40, 50 };

		// 배열의 생성과 초기화를 동시에 할 경우에는 new int[]를 생략 가능하다.
		int[] narr3 = { 10, 20, 30, 40, 50 }; // 생략만 했을 뿐 데이터는 위에와 완전히 동일함
		// int[] narr3;
		// narr3 = {10, 20, 30, 40, 50}; //위의 두 예제들과 다르게 new int 생략시 에러가 난다.

		int sum = 0;
		
		//.length 배열의 갯수를 세어주는 메소드(함수) (생성된 요소의 갯수를 가지고 있는 메소드)
		// java에서는 클래스 안에 들어가는 것들 .~~라고 선언하는 것들을 메소드(함수)라고 한다.
		for(int i=0; i<narr3.length; i++) {
			sum += narr3[i];
		}//for 종료
		System.out.println(sum);
		
		
		int n, m;
		n=10;//n이라는 변수에 10을 담는다.
		m=n;// n에 있는 값을 읽어 m이라는 변수에 복사한다.
		//=(equal)의 오른쪽에 있을 때는 왼쪽에 값을 넣는다.
		System.out.println(n);//n 변수 값을 읽어 출력한다.
		
		
	}// main

}// ArrayTest1