package day3_0322;

public class ArrayTest8 {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, };
		int[] arr2 = new int[3];
		//deep copy1
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		int [] arr3 = new int [3];
		//deep copy2
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		arr1[0] = 100;
		System.out.println(arr1[0]);
		System.out.println(arr3[0]);
		
		//deep copy3
		int[] arr4 = arr1.clone();
		arr1[1] = 200;
		System.out.println(arr1[1]);
		System.out.println(arr4[1]);;
	}//

}//