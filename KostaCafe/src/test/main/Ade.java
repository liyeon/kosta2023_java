package test.main;

public class Ade extends EtcBeverage {

	public Ade(int price) {
		super(price, true);
	}//생성자

	@Override
	String getName() {
		return "에이드";
	}
}//클래스