package day2_0228;

public class ForTest3 {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}//for n
			System.out.println();
		}//for i
		for(int i=0; i<10; i++) {
			for(int j=10; j>i; j--) {
				System.out.print("*");
			}//for n
			System.out.println();
		}//for i
		
		
		System.out.println("=============");
		
		for(int i=10; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}//for n
			System.out.println();
		}//for i
		
		
		
		
		
		
		
		
		
	}//main

}//ForTest