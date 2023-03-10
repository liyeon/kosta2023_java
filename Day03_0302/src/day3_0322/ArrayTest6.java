package day3_0322;

public class ArrayTest6 {

	public static void main(String[] args) {
		//2행
		//가변 다차원 배열
//		int[][] arr = new int[2][];
//		arr[0] = new int[] {1,2,3,};
//		arr[1] = new int[] {4,5};
		
		
		int[][] arr = {
				{1,2,3},
				{4,5}
		};
		
		System.out.println(arr[1].length);
		System.out.println(arr[0].length);
	}//main

}//ArrayTest6