package day5_0306;

class Account {
	String id;
	String name;
	int balance;
	
	Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}//생성자 종료
	
	//입금
	void deposit(int money) {
		balance+=money;
	}//deposit
	
	//출금
	void withdraw(int money) {
		balance-=money;
	}//withdraw
	
	String info(){//void가 아닌 모든 타입은 return 이 와야한다.
		return "계좌번호 : "+id+" 이름 : "+name+" 잔액 : "+balance;
	}//info
	
}//Account

public class ClassTest {
	
	static Account[] accs = new Account[100];//배열에 계좌의 클래스 값을 넣는다.
	static int cnt;
	
	static void makeAccount(String id, String name, int balance) {
		accs[cnt++] = new Account(id, name, balance);
	}//makeAccount
	
	
	static void makeAccount(Account acc){
		accs[cnt++] = acc;
	}//makeAccount
	
	static void allAccountInfo() {
		for(int i=0; i<cnt; i++) {
			System.out.println(accs[i].info());
		};//for
	};//allAccountInfo
	
//	static Account searchAccById(String id) {
//  	Account acc = null;
//		for(int i=0; i<cnt; i++) {
//			if(accs[i].id.equals(id)) {
//				return accs[i];
//			}//if
//		}//for
//		return null;
//	}//searchAccById
	
	// id를 찾는 어카운트 타입의 반복문
	static Account searchAccById(String id) {
		Account acc = null;
		for(int i=0; i<cnt; i++) {
			if(accs[i].id.equals(id)) {
				acc = accs[i];
				break;
			}//if
		}//for
		return acc;
	}//searchAccById
	
	//입금하기
	static void deposit(String id, int money) {
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 다릅니다.");
			
		}else {
			acc.deposit(money);
		}//if 종료
//		for(int i=0; i<cnt; i++) {
//			if(accs[i].id.equals(id)) {
//				accs[i].withdraw(money);
//				break;//반복문 빠져나오기
//			}
//		};
	}//입금하기 종료
	
	//출금하기
	static void withdraw(String id, int money) {
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 다릅니다.");
			
		}else {
			acc.withdraw(money);
		}//if 종료
		
//		for(int i=0; i<cnt; i++) {
//			if(accs[i].id.equals(id)) {
//				accs[i].withdraw(money);
//				break;//반복문 빠져나오기
//			}
//		};
		
	}//출금하기 종료
	
	//계좌찾기
	static void accountInfo(String id) {
		Account acc = searchAccById(id);
		if(acc==null) {
			System.out.println("계좌번호가 다릅니다.");
		}else {
			System.out.println(acc.info());
		}//if 종료
	}//계좌 찾기 종료
	
	public static void main(String[] args) {
		
		makeAccount(new Account("1001", "aaa", 1000000));
		makeAccount(new Account("1002", "bbb", 2000000));
		makeAccount("1003","ccc",3000000);
		
		deposit("1001",10000);
		withdraw("1002",10000);

		allAccountInfo();
		
		System.out.println("====================");
		
		accountInfo("1003");// 계좌번호 : 1003, 이름 : 하길동, 잔액 : 3000000
		accountInfo("10032");
		/*
		Account acc = new Account("1001", "홍길동", 100000);
		System.out.println(acc.info());// 계좌번호 : , 이름 : 잔액 : 
		
		acc.deposit(10000);
		System.out.println(acc.info());//잔액 : 110000
		
		acc.withdraw(5000);
		System.out.println(acc.info());//잔액 : 105000
		*/
		
	}//main

}//ClassTest