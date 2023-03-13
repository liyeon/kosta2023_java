package test.main;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("("+x+","+y+") 로 날아서 이동");
	}//오버라이드
	
	void load() {
		System.out.println("짐을 싣는다");
	}//load
	
	void unload() {
		System.out.println("짐을 내린다.");
	}//unload
}//클래스