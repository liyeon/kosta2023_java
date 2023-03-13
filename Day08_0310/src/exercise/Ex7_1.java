package exercise;

/*
 * 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
 * 섯다카드 20장을 담는 SutdaCard배열을 초기화하시오. 
 * 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고, 
 * 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다.
 * 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
 */
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		/*
		 * (1) 배열 SutdaCard를 적절히 초기화 하시오.
		 */
//		for(int i=0; i<CARD_NUM; i++) {
//			if( i==0||i==2 ||i==7) {
//				// 1, 3, 8에 광이 들어가게
//				cards[i] = new SutdaCard(i+1, true);
//			}else {
////				//i를 10으로 나눈 나머지 +1 
//				cards[i] = new SutdaCard(i%10+1, false);
//			}//조건문
//		}//반복문 
		
		for(int i=0; i<10; i++) {
			if( i==0||i==2 ||i==7) {
				// 1, 3, 8에 광이 들어가게
				cards[i] = new SutdaCard(i+1, true);
			}else {
				cards[i] = new SutdaCard(i+1, false);
			}//조건문
			cards[i+10] = new SutdaCard(i+1, false);
		}//반복문 
	}//생성자
	void shuffle() {
		for(int i=0; i<CARD_NUM*2; i++) {
			int randIdx1 = (int)(Math.random()*CARD_NUM);
			int randIdx2 = (int)(Math.random()*CARD_NUM);
			
			SutdaCard temp = cards[randIdx1];
			cards[randIdx1] = cards[randIdx1];
			cards[randIdx2] = cards[randIdx2];
			cards[randIdx2]=temp;
		}//반복문
	}//shuffle
	
	SutdaCard pick(int idx) {
		if(idx>=0 && idx<20) 
			return cards[idx];		
		else return null;
	
	}//pick
	
	SutdaCard pick() {
		int randIdx = (int)(Math.random()*CARD_NUM);
		return cards[randIdx];
	}//picxk
}//sutdaDeck

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}//sutdaCard

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}//sutdaCard

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}//toString
	

}//sutdaCard

class Ex7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
	}//main
}//Ex7_1