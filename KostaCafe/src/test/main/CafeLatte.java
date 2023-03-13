package test.main;

public class CafeLatte extends Coffee implements IShot, ILattee{
	String milkType = "milk";
	
	public CafeLatte(int price, boolean cold) {
		super(price, cold);
	}//생성자
	
	@Override
	public void addShot(int cnt) {
		shot+=cnt;
		price+=(cnt*SHOT_PRICE);
	}//addShot
	
	
	@Override
	String getName() {
		return "Cafe Latte";
	}//getName

	@Override
	public void changeMilk(String milk) {
		milkType = milk;
	}//changeMilk
	
	@Override
	public String toString() {
		return super.toString()+","+milkType;
	}//toString
}//CafeLatte