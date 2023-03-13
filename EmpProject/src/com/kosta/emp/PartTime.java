package com.kosta.emp;

public class PartTime extends Empolyee implements IBusinessTrip{
	int time;
	int payPerTime;
	
	PartTime() {}
	PartTime(String id, String name,int time, int payPerTime){
		super(id,name);
		setTime(time);
		setPayPerTime(payPerTime);
	}//생성자
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public int getPayPerTime() {
		return payPerTime;
	}
	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}
	
	public int getPay() {
		return getTime()*getPayPerTime();
	}
//	
//@Override
//public String toString() {
//	return super.toString()+" 급여 : "+getPay();
//}
	@Override
	public void goBusinessTrip(int day) {
		time += (day*24);
	}
	
}//클래스 종료