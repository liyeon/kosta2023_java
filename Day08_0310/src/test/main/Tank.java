package test.main;

public class Tank extends Unit implements Fightable{

	@Override
	void move(int x, int y) {
		System.out.println("("+x+","+y+") 로 굴러서 이동");

	}//오버라이드
	
	void changeMode() {
		System.out.println("공격모드를 변환한다.");
	}//changeMode

	@Override
	public void attac() {
		System.out.println("탱크가 공격하고 있음");
	}

}//Tank