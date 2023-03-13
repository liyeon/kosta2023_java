package test.main;

public class ExceptionTest3 {

	static void method1() throws  Exception {//강제로 throw를 생성해서 넘겨줄때는 throws를 선언해줘여ㅑ한다.
		String str = null;
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {//메소드에서 예외처리하고
			System.out.println("메소드에서 1차 예외처리");
			throw new Exception("2차 예외처리"); // 메소드를 호출한 곳에 예외처리를 던져준다. 
		}//try-catch
	}//method1
	public static void main(String[] args) {
		
		
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}//try-catch
		System.out.println("종료");
	}//main
}//ExceptionTest