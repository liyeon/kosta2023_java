package acc;

import exc.BankException;

public class SpecialAccount extends Account {
	String grade;
	// 등급에 따라 이자율을 내부적으로 바꿔줬으면 좋겠다.
	private double rate;

	public SpecialAccount(String id, String name, int balance, String grade) {
		super(id, name, balance);
		// 초기화
		setGrade(grade);
	}// 생성자
	
	
	//////////getset 시작
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
		// grade가 바뀔 때 마다
		switch (grade) {
		case "VIP":rate = 0.04;break;
		case "Gold":rate = 0.03;break;
		case "Silver":rate = 0.02;break;
		case "Normal":rate = 0.01;break;
		}//switch
	}//getset  끝!

	
	@Override
	public void deposit (int money) throws BankException {
		super.deposit(money+(int)(money*rate));
	}//override
	
	@Override
	public String info() {
		return super.info()+", 등급 :"+getGrade();
	}//override info
}// 클래스 종료!