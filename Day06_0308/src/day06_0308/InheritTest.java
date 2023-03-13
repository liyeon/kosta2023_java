package day06_0308;
class Person{
	int age;
	String name;
	String tel;
	String address;
	
	
	//상속하기 위해서는 기본 생성자가 필요하다.
	
	Person(){}
	//constructor1
	Person(String name, int age, String tel, String address){
		this.name=name;
		this.age=age;
		this.tel=tel;
		this.address=address;
	}//생성자
	public int getAge() {
		return age;
	}
	//Source -> Generate getter and setter 
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//오버라이드
	@Override
	public String toString() {
		return "이름 :"+name+" 나이 : "+age+" 전화번호 : "+tel+" 주소 : "+address;
	}//
}//person

//부모의 생성자 상속받기
//자식이 생성할 때 부모의 생성자가 호출된다.
//부모의 변수에 대한 초기화를 자식이 가지고 있다.
class Student extends Person{
	int grade;
	String major;
	
	Student(){}
	Student (String name, int age, String tel, String address, int grade, String major){
		//부모의 기본 생성자가 없을 때 해당 속성을 가진 생성자를 찾아오라는 뜻
		//자식은 부모의 기본 생성자를 기본으로 호출한다.
		super(name,age,tel,address);//constructor1 호출, 자식의 생성자는 이와같이 명시적으로 지정하지 않으면 부모의 기본 생성자를 호출한다.
		this.grade=grade;
		this.major=major;
	}//Student 클래스
	
	@Override
	public String toString() {
		return super.toString()+" 학년 : "+grade+" 전공 : "+major;
	}//override
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}//person을 상속받은 student 클래스


public class InheritTest {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 20, "010-1111-1111", "서울시 도봉구 도봉도봉", 1, "철학");
		System.out.println(s1);
		
		Student s2 = new Student();
		
		s2.setName("김도봉");
		s2.setAge(25);
		s2.setTel("10-0000--0000");
		s2.setAddress("서울시 도봉도봉");
		s2.setGrade(2);
		s2.setMajor("수수수수");
	
		System.out.println(s2);
		
	}//main 종료
}//클래스 종료