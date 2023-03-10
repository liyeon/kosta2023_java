package exercise;

class SutdaCard {
	int num;//카드의 숫자 (1~10사이의 정수 )
	boolean isKwang;//광이면 true, 아니면 false
	/*
	 * (1) 알맞은 코드를 넣어 완성하시오.
	 */
	SutdaCard() {
//		this(1, true);
		num = 1;
		isKwang = true;
	}//

	SutdaCard(int num, boolean isKwang) {
		this.num=num;
		this.isKwang=isKwang;
	}//생성자
	
	String info() {
		//문자열을 반환한다.
		//삼항연산자 true면 k 아니면 빈문자열 
		return num + (isKwang==true? "k" : "");
		
	}//string info
}// SutdaCard

public class Ex6_2 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());

	}// main

}// Ex6_2