package emp;

public class Employee {
//2023.03.08 작성
	//사번이 자동 입력 되도록
	static int sid = 1000;
	String id;
	String name;
	String department="none";
	int pay;
	
	//기본 생성자
	Employee() {
		//sid가 1001되고 문자열로 바꾸기
		this.id =++sid+"";
	}
	
	// 생성자
	// 사번 : id 이름 : name 소속부서 : department 급여 pay
	public Employee(String name, String department, int pay) {
		//생성될때마다 1씩 늘어나기
		this.id =++sid+"";
		this.name=name;
		this.department=department;
		this.pay=pay;
	}// 생성자 종료
	
	
	public Employee(String name, int pay) {
		this.id =++sid+"";
		this.name=name;
		this.pay=pay;
	}// 생성자 종료
	
	public static int getSid() {
		return sid;
	}

	public static void setSid(int sid) {
		Employee.sid = sid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	//모든 문자열은 toString이라는 메소드를 가진다.
	//오버라이딩
	public String toString() {
		return "사번 : "+id+" | 이름 : "+name+" | 부서 : "+department+" | 급여 : "+pay;
	}
	
}// class Employee 종료