package test.main;

abstract public class Coffee extends Beverage{
	String bean;
	int shot=1;
	
	public String getBean() {
		return bean;
	}

	public void setBean(String bean) {
		this.bean = bean;
	}

	public Coffee(int price, boolean cold) {
		super(price, cold);
	}//생성자

	@Override
	public String toString() {
		return getName()+" : "+shot+"shot,"+price+"원";
	}

	

//	@Override
//	public void addShot(int cnt) {
//		shot+=cnt;
//		price+=(cnt*SHOT_PRICE);
//	}
}//Coffee