package day4_0303;

public class ClassTest2 {
	public static void main(String[] args) {
		//클래스의 배열은 객체가 아니고 배열 객체임
		//각 배열 요소에 객체를 생성해서 사용해야 한다.
		Person[] pers = new Person[3];//배열 3개가 만들어짐
		
		for(int i=0; i<pers.length; i++) {
			pers[i] = new Person();
			pers[i].age=20;
			pers[i].name="sss";

			
			pers[i].info();
		}//for
	}//main
}//