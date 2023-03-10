package day4_0303;
//절차적 프로그래밍
class Person{//data type 정의
	int age;
	String name;
	
	//매개변수가 없는 생성자가 기본생성자다.생성자를 지정해주지 않으면 자동으로 기본 생성자로 지정해준다.
	Person(){} // 생성자. 클래스명과 동일하게 생긴 메소드. 단 메소드 타입을 지정하지 않는다.
	//메소드
	public void info() {
		System.out.println("이름 : "+name+", 나이 : "+age);
		
	}
}//class Person

public class ClassTest1 {

	public static void main(String[] args) {
		// int[] arr; 와 동일 생성 할 떄는 new 를 해야 생성됨 
		//new Person():객체, p: 레퍼런스(객체의 주소를 담고 있다. 그 주소를 통해 객체에 접근한다.
		Person p = new Person();//객체 
		p.age=20; // p= 레퍼런스 변수
		p.name="홍길동";
		
		Person p2 = p;
		p.info();
		p2.info();
		
		p.age=30;
		
		p2.info();
	}//main

}//ClassTest1