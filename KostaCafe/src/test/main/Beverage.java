package test.main;

abstract public class Beverage {
	int price;
	boolean cold;
	
	public Beverage(int price, boolean cold) {
		this.price=price;
		this.cold=cold;
		
	}//생성자
	
	abstract String getName();
}//Beverage