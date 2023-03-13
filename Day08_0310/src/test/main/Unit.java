package test.main;

public abstract class Unit {
	int x,y;
	
	abstract void move(int x, int y);//추상 메소드
	
	void stop() {
		System.out.println("("+x+","+y+"+멈춤");
	}
}//추상클래스 unit