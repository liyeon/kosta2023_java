package com.kosta.emp;

public class EmpMain {

	public static void main(String[] args) {
//		Sales emp1 = new Sales("1001", "홍길동", 1000000, 5000000);
//		System.out.println(emp1);
		
		Company com = new Company();
		
		Permanent emp1 = new Permanent("1001","홍길동",20000000);
		Sales emp2 = new Sales("1002", "김길동", 1000000, 1000000);
		PartTime emp3 = new PartTime("1003", "박길동", 160, 15000);
		
		com.enterEmp(emp1);
		com.enterEmp(emp2);
		com.enterEmp(emp3);
		
		com.allEmpInfo();
		System.out.println("급여 총액 : "+com.getTotalPay());
		
		
//		com.regBusinessTrip(emp1, 2);
		com.regBusinessTrip(emp2, 2);
		com.regBusinessTrip(emp3, 3);
		
	}//메인

}//클래스