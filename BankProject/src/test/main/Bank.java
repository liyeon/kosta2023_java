package test.main;

import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;

public class Bank {
	Account[] accs = new Account[100];// 계좌 배열
	int cnt;

	Scanner sc = new Scanner(System.in);
	
	int menu() {
		System.out.println("[  KOSTA BANK  ]");
		System.out.println("0.종료");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌 조회");
		System.out.println("5. 전체 계좌조회");

		System.out.print("선택>>");
		// 라인을 가져와서 int 타입으로 변환한다.
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	};// menu

	void makeAccountMenu() {
		System.out.println("[계좌개설]");
		System.out.println("1. 일반 계좌");
		System.out.println("2. 특수 계좌");
		System.out.println("선택 >> ");
		
		int sel = Integer.parseInt(sc.nextLine());
		switch (sel) {
		case 1 : makeAccount (); break;
		case 2 : makeSpecialAccount(); break;
		}
	}//
	
	
	// 계좌개설
	void makeAccount() {
		System.out.println("[ 일반 계좌 개설 ]");

		// 계좌번호 입력받고
		System.out.print("계좌 번호 : ");
		String id = sc.nextLine();

		// 이름 입력받고
		System.out.print("이름 : ");
		String name = sc.nextLine();

		// 입금할 금액 입력 받고 정수형 int타입으로 바꿔주기!
		// 엔터(아스키코드값)의 스트림 값도 string에 포함되기 때문에 정수형 int 타입으로 바꿔줘야한다.
		System.out.print("입금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		
		
		
		// 입력받은 값을 배열에 넣어주기!
		
		Account acc = searchAccById(id);
		
		//입력받은 계좌번호가 없다면 등록하기
		/*
		if (acc == null) {
			accs[cnt++] = new Account(id, name, money);
		} else {
			//계좌번호가 있으면
			System.out.println("중복된 계좌입니다.");
		}//if문 종료
		*/
		
		if (acc != null) {
			System.out.println("중복된 계좌입니다.");
			return;
		}//if문 종료
		accs[cnt++] = new Account(id, name, money);
		
	}// 계좌개설 종료
	
	
	// 계좌개설
		void makeSpecialAccount() {
			System.out.println("[ 특수 계좌 개설 ]");

			// 계좌번호 입력받고
			System.out.print("계좌 번호 : ");
			String id = sc.nextLine();

			// 이름 입력받고
			System.out.print("이름 : ");
			String name = sc.nextLine();

			System.out.print("입금액 : ");
			int money = Integer.parseInt(sc.nextLine());
			
			System.out.println("등급 : ");
			String grade = sc.nextLine();
			
			Account acc = searchAccById(id);
			if(acc!=null) {
				System.out.println("같은 계좌번호가 이미 있습니다.");
				return;
			}
			
			accs[cnt++] = new SpecialAccount(id, name, money, grade);
			
		}// 계좌개설 종료

	// 계좌번호 찾기
	Account searchAccById(String id) {
		Account acc = null;
		for (int i = 0; i < cnt; i++) {
			if (accs[i].getId().equals(id)) {
				acc = accs[i];
				break;
			} // if문 종료
		} // 반복문 종료
		return acc;
	}// 종료
	
	// 입금하기
	void deposit() {
		System.out.println("[     입금하기     ]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		System.out.print("입금액 : ");
		int money = Integer.parseInt(sc.nextLine());

		Account acc = searchAccById(id);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
		} else {
			acc.deposit(money);
		}//if문 종료
	}// 입금하기 종료

	// 출금하기
	void withdraw() {
		System.out.println("[     출금하기     ]");
		
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		
		System.out.print("출금액 : ");
		int money = Integer.parseInt(sc.nextLine());

		Account acc = searchAccById(id);
		
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
		} else {
			acc.withdraw(money);
		}//if문 종료
		
	}// 출금하기 종료

	// 계좌조회
	void accountInfo() {
		System.out.println("[     계좌조회하기     ]");
		
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		
		if(acc==null) {
			System.out.println("계좌번호가 없습니다.");
		}else {
			System.out.println(acc.info());
		}//if 종료
		
	}// 계좌조회 종료

	// 전체계좌조회
	void allAccountInfo() {
		
		System.out.println("[  전체 계좌 조회  ]");

		for (int i = 0; i < cnt; i++) {
			System.out.println(accs[i].info());
		} // 반복문 종료!
		
	}// 전체계좌조회 종료

	public static void main(String[] args) {
		Bank bank = new Bank();

		while (true) {
			int sel = bank.menu();
			if (sel == 0)
				break;
			switch (sel) {
			case 1:
				bank.makeAccountMenu();
				break;
			case 2:
				bank.deposit();
				break;
			case 3:
				bank.withdraw();
				break;
			case 4:
				bank.accountInfo();
				break;
			case 5:
				bank.allAccountInfo();
			}// switch 종료
		} // while 종료
	}// main 종료

}// 클래스 Bank 종료