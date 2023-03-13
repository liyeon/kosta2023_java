package test.main;

class Person implements Cloneable {// 자바에서 제공하는 인터페이스
	int age;
	String name;

	Person() {
	}

	Person(String name, int age) {
		this.age = age;
		this.name = name;
	}// Person

	Person(Person p) {// 복사 생성자 자바에서는 잘 사용하지 않음
		this.age = p.age;
		this.name = p.name;
	}

	@Override
	protected Object clone() {// throws CloneNotSupportedException try-catch 를 메소드 안에서 하면 throws 를 붙이지 않아도 된다.
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} // catch
		return obj;
	}// clone

	@Override
	public String toString() {
		return name + "," + age;
	}// toString

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false;
		Person p = (Person) obj;
		return age == p.age && name.equals(p.name);
	}// equals

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}// hash Code
}// Person

public class CloneTest2 {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = p1;
		Person p3 = new Person(p1);
		Person p4 = (Person) (p1.clone());// 다운 캐스팅
		p1.age = 30;

		p1.age = 30;
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}//

}//