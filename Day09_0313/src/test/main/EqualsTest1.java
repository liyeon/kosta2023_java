package test.main;

public class EqualsTest1 {

	public static void main(String[] args) {
		Person p1 = new Person("고길동", 20);
		Person p2 = new Person("고길동", 20);
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}

}
