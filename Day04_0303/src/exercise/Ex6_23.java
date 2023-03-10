package exercise;

public class Ex6_23 {

	static int max(int[] arr) {
		int m = -999999;
		
		if(arr==null || arr.length==0) {
			
			return m;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			} // if문 종료
		} // for문 종료
		
		return m;
		
	}// static int mx

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
	}// main
}// class