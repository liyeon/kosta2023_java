package test.main;

public class Cafe {
	Beverage[] cart = new Beverage[100];
	int cnt;
	public void addBeverage(Beverage beverage) {
		cart[cnt++] = beverage;
	}
	
	
	public void addShot(IShot beverage, int cnt) {
		beverage.addShot(cnt);
	}//addShot
	
	public void changeMilk(ILattee beverage, String milk) {
		beverage.changeMilk(milk);
	}
	
	public void calculate() {
		int tot=0;
		for(int i=0; i<cnt; i++) {
			tot += cart[i].price;
			System.out.println(cart[i]);
		}
		System.out.println("총 가격:"+tot+"원");
	}
	
	
	public static void main(String[] args) {
	Americano americano = new Americano(1500, true);
	CafeLatte latte = new CafeLatte(2000, false);
	CafeMoca moca = new CafeMoca(2500, true);
	StrawberryLatte slatte = new StrawberryLatte(2500);
	
	Cafe cafe = new Cafe();
//	
//	addShot(americano, 1);
//	addShot(latte, 1);
//	//addShot(moca, 1);//모카는 샷추가 안됨
//	
//	
//	StrawberryLatte sLatte = new StrawberryLatte(2500);
//	//changeMilk(americano, "oat milk");
//	changeMilk(latte, "oat milk");
//	changeMilk(sLatte, "oat milk");
	
	
	cafe.addBeverage(americano);
	cafe.addBeverage(latte);
	cafe.addBeverage(moca);
	cafe.addBeverage(slatte);
	cafe.calculate();
	
	
	}//메인

}//클래스
