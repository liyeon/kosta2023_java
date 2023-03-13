package test.main;

public class Marine extends Unit implements Fightable{

	@Override
	void move(int x, int y) {
		System.out.println("("+x+","+y+") 로 걸어서 이동");
		
	}//오버라이드
	
	void stimPack() {
		System.out.println("스팀팩.....");
	}//stimPack

	@Override
	public void attac() {
		System.out.println("마린이 공격하고 있음");
	}//attac
}//Marine