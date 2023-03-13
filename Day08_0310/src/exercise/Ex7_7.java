package exercise;

//다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
class Parent {
	int x = 100;

	Parent() {//1
		this(200);
		System.out.println("Parent()");
	}

	Parent(int x) {//2
		System.out.println("Parent(int x)");
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {//3
		this(1000);
		System.out.println("Child()");
	}

	Child(int x) {//4
		this.x = x;
		System.out.println("Child(int x)");
	}

//	@Override
//	int getX() {
//		return x;
//	}
}

class Ex7_7 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX());
	}
}