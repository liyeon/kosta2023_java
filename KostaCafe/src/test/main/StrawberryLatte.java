package test.main;

public class StrawberryLatte extends EtcBeverage implements ILattee {
	String milkType = "milk";

	public StrawberryLatte(int price) {
		super(price, true);
	}// 생성자

	@Override
	String getName() {
		return "딸기라떼";
	}//getName

	@Override
	public void changeMilk(String milk) {
		milkType = milk;
	}//changeMilk
	
	@Override
	public String toString() {
		return super.toString()+","+milkType;
	}//toString
			
}// 클래스
