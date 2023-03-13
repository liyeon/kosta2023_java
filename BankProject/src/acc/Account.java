package acc;

import exc.BANK_ERROR;
import exc.BankException;

public class Account {
	String id;
	String name;
	int balance;

	Account() {}
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}// 생성자 종료
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// 입금
	public void deposit(int money) throws BankException {
		if(money<=0) {
			throw new BankException(id+"입금오류", BANK_ERROR.DEPOSIT);
		}balance += money;	//정상 처리
	}// deposit


	// 출금
	public void withdraw(int money) throws BankException {
		if(balance < money) {
			throw new BankException(id+"출금오류", BANK_ERROR.WITHDRAW);
		}balance -= money;	//정상 처리
//		if(balance>=money) {
//			balance -= money;	
//		}// if문 종료
	}// withdraw

	public String info() {// void가 아닌 모든 타입은 return 이 와야한다.
		return "계좌번호 : " + id + " 이름 : " + name + " 잔액 : " + balance;
	}// info

}// Account
