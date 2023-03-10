package exercise;

public class Ex4_12 {
	public static void main(String[] args) {
		for(int k=2; k<=9; k+=3 ) {
			for (int n = 1; n <= 3; n++) {// 3까지
				for (int i= k; i <= k+2 && i<=9; i++) {// 몇단
					System.out.print(i + "x" + n + "=" + n * i + "\t");
				} // for문 n
				System.out.println();
			} // for문 i
			System.out.println();
		}// for문 k
	}// main
}// class