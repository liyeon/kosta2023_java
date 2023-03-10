package exercise;

public class Ex6_20 {
	/*
	 * (1) shuffle메서드를 작성하시오.
	 */
	static int[] shuffle(int[] arr) {
		if(arr == null || arr.length==0) return arr;
		
		for (int i=0; i<arr.length*2; i++) {
			int idx1 = (int)(Math.random()*arr.length);
			int idx2 = (int)(Math.random()*arr.length);
			int temp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}