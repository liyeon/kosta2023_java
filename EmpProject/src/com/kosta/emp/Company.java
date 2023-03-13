package com.kosta.emp;

public class Company {
	Empolyee[] emps = new Empolyee[100];
	int cnt;

	Company() {}

	// 배열에 넣어주기
	public void enterEmp(Empolyee emp) {
		emps[cnt++] = emp;
	}// enterEmp

	public void allEmpInfo() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(emps[i]);
		} //
	}// allEmpInfo
	
	public int getTotalPay() {
		int tot = 0;
		for (int i = 0; i < cnt; i++) {
			tot += emps[i].getPay();
		}//for문
		return tot;
	}//getTotalPay
	
	public void regBusinessTrip(IBusinessTrip emp, int day) {
		emp.goBusinessTrip(day);
	}//휴가
}//클래스