package day3_0322;

public class ArrayTest5 {

	public static void main(String[] args) {
		int[][] narr = {
			{10,11,12, 0},
			{20,21,22, 0},
			{30,31,32, 0},
			{40,41,42, 0},
			{50,51,52, 0},
			{0,0,0,0}
		};
		// 이중 for 문
		//행의 합을 구하고 싶다.
		//열의 합도 구하고 싶다.
		
		for (int i = 0; i < narr.length-1; i++) {
			for(int j = 0; j < narr[i].length-1; j++) {
				//narr[i][3] += narr[i][j];
				//narr[5][j] += narr[i][j];
				//narr[5][3] += narr[i][j]; 
				
				narr[i][narr.length-3] += narr[i][j];
				narr[narr.length-1][j] += narr[i][j];
				narr[narr.length-1][narr.length-3] += narr[i][j]; 
			}//
			
		}//
		
		for (int i = 0; i < narr.length; i++) {
			for (int j = 0; j < narr[i].length; j++) {
				System.out.print(narr[i][j] + "\t");
			} // for j
			System.out.println();
		} // for i

	}//main

}//ArrayTest5