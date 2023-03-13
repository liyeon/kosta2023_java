package test.main;

abstract class Player {
	int currentPos;

	public Player() {
		currentPos = 0;
	}// 생성자

	abstract void play(int pos);// 추상 메소드

	abstract void stop();// 추상 메소드

	void play() {
		play(currentPos);
	}// play
}// 추상 클래스

class Marine2 extends Player {
	// 추상클래스를 상속받으려면 부모의 메소드들을 오버라이딩 해야한다.

	@Override
	void play(int pos) {
		System.out.println(pos + "로 이동");
	}//오버라이드

	@Override
	void stop() {
		System.out.println("marine 이 멈춤");
	}//오버라이드

}// Marine

public class AbstractTest1 {

	public static void main(String[] args) {
		
//		Player p =new Player()// 추상 클래스는 인스턴스 할 수 없다.
		Player p =new Marine2(); //업캐스팅
		p.play();
	}// main

}// class AbstractTest1