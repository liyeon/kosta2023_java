package day2_0228;

import java.util.Scanner;//ctrl + shift + o

public class InputTest {

	public static void main(String[] args) {
		// 콘솔에서 입력받기!
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println(str);
		
		for(int i=0; i<=3; i++) {
			int n = sc.nextInt();	
			System.out.println(n);
		}//for문
	
	}//main
}//InputTest