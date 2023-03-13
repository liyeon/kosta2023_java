package com.kosta.emp;

public class Permanent extends Empolyee {
	int pay;
	Permanent(){}
	Permanent(String id, String name,int pay){
		super(id,name);
		setPay(pay);
	}//생성자
	public int getPay() {
		return pay;
	}//겟
	public void setPay(int pay) {
		this.pay = pay;
	}//
	
//	@Override
//	public String toString() {
//		return super.toString()+"급여 : "+getPay();
//	}//toString
}//Permanent