package day3_0322;

public class ArrayTest3 {

	public static void main(String[] args) {
		//다차원 배열
		//5행 3열
		int[][] narr1 = new int[5][3];
		//행의 갯수만 나옴 
		System.out.println(narr1.length);
		System.out.println(narr1[0].length);
		System.out.println(narr1[1].length);
		
		//0행 0열에 10을 넣겠다.
		narr1[0][0] = 10;
		narr1[0][1] = 11;
		narr1[0][2] = 12;
		
		narr1[1][0] = 20;
		narr1[1][1] = 21;
		narr1[1][2] = 22;
		
		narr1[2][0] = 30;
		narr1[2][1] = 31;
		narr1[2][2] = 32;
		
		narr1[3][0] = 40;
		narr1[3][1] = 41;
		narr1[3][2] = 42;
		
		narr1[4][0] = 50;
		narr1[4][1] = 51;
		narr1[4][2] = 52;
		
		//이중 for 문
		for(int i=0; i<narr1.length; i++) {
			for(int j=0; j<narr1[0].length;j++) {
				System.out.print(narr1[i][j]+"\t");
			}//for j
			System.out.println();
		}//for i
		
		
	}//main
}//ArrayTest