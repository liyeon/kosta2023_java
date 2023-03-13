package test.main;

public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = null;
		//예외 처리
		try {
			System.out.println(str.toString());//null의 메소드를 이용하면 NullPointerException
		} catch (NullPointerException e) {
			e.printStackTrace(); // 어떤 예외가 발생했는지 확인
			System.out.println("null 예외");
			System.err.println(e.getMessage());
		}//try-catch
		
		
		System.out.println("종료");
	}//main
}//ExceptionTest