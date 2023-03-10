package exercise;

class Student {
	String name;// 학생이름
	int ban;// 반
	int no;// 번호
	int kor;// 국어점수
	int eng;// 영어점수
	int math;// 수학점수

	Student() {

	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}// 생성자

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return Math.round((getTotal()/3F)*10) /10F;
	}
	
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}//info
}// Student

public class Ex6_5 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
		
		
		Student s2 = new Student("홍길동",1,1,100,60,76);
		System.out.println(s2.info());

	}// main

}// ex6_5