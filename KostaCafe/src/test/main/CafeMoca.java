package test.main;

public class CafeMoca extends Coffee{

	public CafeMoca(int price, boolean cold) {
		super(price, cold);
	}//생성자
	
	@Override
	String getName() {
		return "카페모카";
	}
}//클래스