package test.main;

public class ExceptionTest2 {
	public static void main(String[] args) {
		int [] arr1 = new int[] {10,20,30,40};
		int [] arr2 = new int[] {2,0,6};
/*		
		//예외처리
		try {
			for(int i =0; i<arr1.length; i++) {
				System.out.println(arr1[i]/arr2[i]);
			}//반복문
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}//try-catch
*/
		int tot = 0;
		int cnt = 0;
		for(int i =0; i<arr1.length; i++) {
			try {
				cnt++;
				tot += arr1[i]/arr2[i];
				
			} catch (ArithmeticException e) { // 예외 종류에 따라 다른 처리를 해준다.
				System.out.println(e.getMessage());
				tot += 1; // 0으로 나눌때는 몫을 1로 
			} catch (ArrayIndexOutOfBoundsException e) {
				// 각각의 대체 처리를 넣어준다.
				System.out.println(e.getMessage());
				cnt--; 
			}//try-catch
		}//반복문
		
		System.out.println(tot/cnt);
		
		System.out.println("종료");
	}//main
}//ExceptionTest