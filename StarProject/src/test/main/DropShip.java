package test.main;

public class DropShip extends AirUnit implements Repairable{

	public DropShip() {
		super(100);
		hitPoint = MAX_HP;
	}//DropShip
	
	@Override
	public String toString() {
		return "DropShip";
	}//toString
	
}//