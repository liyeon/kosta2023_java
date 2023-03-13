package test.main;

public class Tank extends GroundUnit implements Repairable{

	public Tank() {
		super(150);//hp
		hitPoint = MAX_HP;
	}//생성자

}//GroundUnit