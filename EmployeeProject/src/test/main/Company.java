package test.main;

import java.util.Scanner;

import emp.Employee;

//2023 03 08 작성
public class Company {
	// componey class에 employee 배열을 넣기
	Employee[] emps = new Employee[100];
	int cnt;

	void enter() {
		System.out.println("[입사등록");

		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("부서 : ");
		String department = sc.nextLine();

		System.out.println("급여 : ");

		int pay = Integer.parseInt(sc.nextLine());

		if (department == null || department.length() == 0) {
			emps[cnt++] = new Employee(name, pay);
		} else {
			emps[cnt++] = new Employee(name, department, pay);
		}//if 문 종료

	}// 입사 등록 종료

	
	Employee searchEmpById(String id) {
		Employee emp = null;
		for (int i = 0; i < cnt; i++) {
			if (emps[i].getId().equals(id)) {
				emp = emps[i];
				break;
			} // if문 종료
		} // 반복문 종료
		return emp;
	}//사원 찾기 
	
	void empInfo() {
		System.out.println("[사원 조회]");
		
		Employee emp = null;
//		do {
//			//사번으로 찾기
//			System.out.print("사원번호 : ");
//			String id = sc.nextLine();
//			emp = searchEmpById(id);
//			if(emp==null) {
//				System.out.println("사번이 없습니다.");
//			}
//		}while(emp==null);
		
		while(true) {
			System.out.print("사원번호 : ");
			String id = sc.nextLine();
			emp = searchEmpById(id);
			if(emp==null) {
				System.out.println("사번이 없습니다.");
			}else {
				break;
			}//if문
		}//while문
		
		System.out.println(emp);
	}// 사원 검색 종료

	void allEmpInfo() {
		System.out.println("[  전체 사원 조회  ]");

		for (int i = 0; i < cnt; i++) {
			System.out.println(emps[i]);
		}//for문 종료
	}// 전체 사원 검색 종료

	void transfer() {
		System.out.println("[부서 이동]");
		
		Employee emp = null;
		while (true) {
			//부서 이동할 사번 입력
			System.out.print("사원번호 : ");
			String id = sc.nextLine();
			emp=searchEmpById(id);
			if(emp==null) {
				System.out.println("사번이 없습니다.");
			}else {
				break;
			}//if문 종료
		}//emp
		
		System.out.println("현재 부서 :"+emp.getDepartment());
		
		System.out.print("변경할 부서 : ");
		String department = sc.nextLine();
		
		emp.setDepartment(department);
		
		System.out.println(emp);
	}// 부서 이동 종료

	void totalPay() {
		System.out.println("[ 급여 총 금액 ]");
		int total = 0;
		for (int i = 0; i < cnt; i++) {
			total += emps[i].getPay();
		}//for문 종료
		System.out.println(total);
		
	}// 급여 총 금액 종료
	
	
	//급여 변경 
	void changePay() {
		System.out.println("[ 급여 변경 ]");
		Employee emp = null;
		while (true) {
			//급여변경할 사번 입력
			System.out.print("사원번호 : ");
			String id = sc.nextLine();
			emp=searchEmpById(id);
			if(emp==null) {
				System.out.println("사번이 없습니다.");
			}else {
				break;
			}//if문 종료
		}//emp
		
		System.out.println("현재 급여 :"+emp.getPay());
		
		System.out.print("변경할 급여 : ");
		int money = Integer.parseInt(sc.nextLine());
		
		emp.setPay(money);
		
		System.out.println(emp);
	}//급여 변경 종료
	
	
	
	
	Scanner sc = new Scanner(System.in);

	int menu() {
		System.out.println("[ 코스타 주식회사ㅋ]");
		System.out.println("0. 종료");
		System.out.println("1. 입사등록");
		System.out.println("2. 사원조회");
		System.out.println("3. 전체 사원 검색");
		System.out.println("4. 부서이동");
		System.out.println("5. 급여총금액");
		System.out.println("6. 급여변경");
		System.out.print("선택>>");
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	};

	public static void main(String[] args) {

		Company company = new Company();

//		// 사번 : id 이름 : name 소속부서 : department 급여
//		Employee emp1 = new Employee("1001", "홍길동", "홍보부", 100000);
//		Employee emp2 = new Employee("1001", "홍길동", 200000);
//
//		/*
//		 * 출력 내용 사번 : 1001, 이름 : 홍길동, 부서 : 홍보부, 급여 : 100000; 사번 : 1001, 이름 : 홍길동, 부서 :
//		 * NONE, 급여 : 100000;
//		 */
//		System.out.println(emp1);
//		System.out.println(emp2);

		while (true) {
			int sel = company.menu();
			// 0이면 종료
			if (sel == 0)
				break;
			switch (sel) {
			case 1:
				company.enter();
				break;
			case 2:
				company.empInfo();
				break;
			case 3:
				company.allEmpInfo();
				break;
			case 4:
				company.transfer();
				break;
			case 5:
				company.totalPay();
				break;
			case 6:
				company.changePay();
				break;
			}// switch 문 종료
		} // while문 종료
	}// main

}// class Company