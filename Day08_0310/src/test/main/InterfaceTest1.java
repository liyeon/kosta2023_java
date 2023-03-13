package test.main;

interface Fightable{
	void attac();
} //interface
 
class Fighter extends Unit implements Fightable{

	@Override
	public void attac() {
		System.out.println("공격");
		
	}//attac

	@Override
	void move(int x, int y) {
		System.out.println("움직이는중");
		
	}//move
	//====오버라이딩 종료
}//Fighter

public class InterfaceTest1 {
	static void attack(Fightable unit) {
		
	}
	public static void main(String[] args) {
		
		Fighter fighter1 = new Fighter();
		fighter1.attac();
		fighter1.move(0, 0);
		fighter1.stop();
		
		Unit fighter2 = new Fighter();//업캐스팅
		//fighter2.attac();//Unit에 없는 메소드 호출 불가
		fighter2.move(0, 0);
		fighter2.stop();
		
		Fightable fighter3 = new Fighter();//interface로도 upcasting 가능하다(상속개념 적용됨)
		fighter3.attac();
//		fighter3.move(0,0);//Fightable에 없는 메소드 호출 불가
//		fighter3.stop();
		
		
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		attack(fighter1);
//		attack(fighter2);//error
		attack(fighter3);
		attack(marine);//error
		attack(tank);//error
		
	}//메인

}//클래스