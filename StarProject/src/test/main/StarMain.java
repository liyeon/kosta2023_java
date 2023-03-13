package test.main;

public class StarMain {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		DropShip dropship = new DropShip();
		
		scv.repair(tank);
		scv.repair(scv);
//		scv.repair(marine); // 인터페이스를 상속받지 않음
		scv.repair(dropship);
		System.out.println(scv);
		
	}//메인

}//클래스