package test.main;

public class Marine extends GroundUnit {
	public Marine() {
		super(40);//hp super를 통해 초기화
		hitPoint = MAX_HP;
	}//

	@Override
	public String toString() {
		return "Marine";
	}//toString
}//Marine