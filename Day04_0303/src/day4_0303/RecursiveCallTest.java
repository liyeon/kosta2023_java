package day4_0303;

public class RecursiveCallTest {//재귀호출
	public static int factorial (int n) {
		if(n==1) return n;
		return n*factorial(n-1);
	}//fac
	public static void main(String[] args) {
		int res = factorial(5);
		System.out.println(res);

	}//main

}//class