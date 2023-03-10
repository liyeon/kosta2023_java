package day3_0322;

public class ArrayTest7 {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30};		
		
		int[] arr2 = arr1;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		
		System.out.println(System.lineSeparator()+System.lineSeparator()+"==================="+System.lineSeparator()+System.lineSeparator());
		arr1[0] = 100;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
	}//main

}//ArrayTest7