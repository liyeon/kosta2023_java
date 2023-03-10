package day4_0303;

//생성자는 new 할 때 자동으로 호출된다.
//생성자  초기화를 위한 메소드
class Student {
	int id;
	int grade;
	String name;

	Student() {
		System.out.println("Student");
	}// 하단의 것과 오버로딩

	Student(int id, int grade, String name) {
		this.id = id;
		this.grade = grade;
		this.name = name;
	}

	Student(int id) {
		this(id, 1, "none");//생성자에서 또다른 생성자를 호출 할 때만 사용 할 수 있다.
// 		this.id=id;
//		this.name="none";
//		this.grade=1;
	}

	Student(int id, String name) {
		this(id, 1, "none");
//		this.id = id;
//		this.name = name;
//		this.grade = 1;
	}

	void info() {
		System.out.printf("학번 %d | 이름: %s | 학년 : %d\n", id, name, grade);
	}
}//

public class ConstructorTest {

	public static void main(String[] args) {
		// new 라는 연산자는 클래스의 변수를 생성시킨다.
		Student s = new Student();
		s.id = 100;
		s.grade = 3;
		s.name = "lili";
		s.info();
		Student s2 = new Student(101, 4, "sdff");
		s2.info();

		Student s3 = new Student(102);
		s3.info();
		// 학번 : 102, 이름 : null, 학년 : 1;

		Student s4 = new Student(103, "park");
		s4.info();
	}//

}//