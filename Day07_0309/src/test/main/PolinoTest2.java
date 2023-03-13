package test.main;

public class PolinoTest2 {

	static Account[] accs = new Account[100];
	static int cnt;

	// 배열에 넣어주기
	static void addAccount(Account acc) {
		accs[cnt++] = acc;
	}// addAccount

	// 배열에 있는 전체 데이터를 불러오기
	static void allAccountInfo() {
		for (int i = 0; i < cnt; i++) {
			if (!(accs[i] instanceof SpecialAccount)) {// instanceof 연산자
				System.out.println(accs[i].info());
			} // if문
		} // 반복문 종료

	}// allAccountInfo()

	// 전체 목록 중 SpecialACcount 만 찾고싶당
	static void allSpecialAccountInfo() {
		for (int i = 0; i < cnt; i++) {
			// 스페셜 어카운트는 스페셜 어카운트의 연산자이다.
			// 스페셜어카운트는 어카운트의 연산자이다.
			// 자식객체는 부모객체의 연산자(instatncerof)이기도 하다.
			// 부모는 자식의 인스턴스가 아니다.
			if (accs[i] instanceof SpecialAccount) {// instanceof 연산자
				System.out.println(accs[i].info());
			} // if문
		} // 반복문
	}// allSpecialAccountInfo

	static Account searchById(String id) {
		Account acc = null;
		for (int i = 0; i < cnt; i++) {
			if (accs[i].getId().equals(id)) {
				acc = accs[i];
				break;
			} // if문 종료
		} // 반복문 종료
		return acc;
	}// serchById

	static void deposit(String id, int money) {
		Account acc = searchById(id);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		} //
		acc.deposit(money);
	}// 입금
	
	
	static void withdraw(String id, int money) {
		Account acc = searchById(id);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		} //
		acc.withdraw(money);
	}// 출금
	public static void main(String[] args) {
		Account acc1 = new Account("1001", "hong", 100000);
		SpecialAccount acc2 = new SpecialAccount("1002", "kim", 200000, "VIP");
		SpecialAccount acc3 = new SpecialAccount("1003", "park", 100000, "Gold");

//		accs[cnt++] = new Account("1001","hong",100000);
//		accs[cnt++] = new SpecialAccount("1002","kim",200000, "VIP");
//		accs[cnt++] = new SpecialAccount("1003","park",100000, "Gold");

		addAccount(acc1);
		addAccount(acc2);
		addAccount(acc3);
		
		deposit("1001", 10000);// 일반계좌
		deposit("1002", 10000);// 스페셜계좌
		deposit("1003", 100);
		
		withdraw("1001", 5000);
		withdraw("1002", 5000);
		// AccountInfo 객체만 가져오기
		System.out.println("AccountInfo 객체만 ");
		allAccountInfo();
		// specail객체를 가지고 있는 배열만 가져오기
		System.out.println("SpecialAccountInfo 객체만 ");
		allSpecialAccountInfo();

		
	}// main

}// 클래스 종료