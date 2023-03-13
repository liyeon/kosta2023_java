package com.kosta.emp;

public class Sales extends Permanent  implements IBusinessTrip{
	int incentive;
	
	Sales(){}
	
	Sales(String id, String name, int pay,int incentive) {
		super(id,name,pay);
		setIncentive(incentive);
	}//생성자

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	
	@Override
	public int getPay() {
		return super.getPay()+getIncentive();
	}//겟

	@Override
	public void goBusinessTrip(int day) {
		incentive += (day*10000);
	}//goBus
}//Sales