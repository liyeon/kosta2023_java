package test.main;

public class SCV extends GroundUnit implements Repairable {

	public SCV() {
		super(60);
		hitPoint = MAX_HP;
	}//Scv
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SCV";
	}//toString
	
	public void repair (Repairable unit) {
		if(unit instanceof Unit) {
			Unit u = (Unit)unit;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}//while
		}//조건문
	}//repair
}//클래스