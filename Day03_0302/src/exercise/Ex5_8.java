package exercise;

public class Ex5_8 {

	public static void main(String[] args) {
		int[] answer = { 4, 1, 2, 3, 4, 1, 2, 3, 3, 1 };
		int[] counter = new int[4];
		
		//counter [0] = 3; // 1의 갯수
		//counter [1] = 2; // 2의 갯수
		//counter [2] = 3; // 3의 갯수
		//counter [3] = 2; //4의 갯수
		 
		for(int i=0; i<answer.length; i++) {
			counter[answer[i]-1]++;
		}//for answer
		
		for(int i=0; i<counter.length; i++) {
			System.out.print(counter[i]);
			for(int j=0; j<counter[i]; j++){
				System.out.print("*");
			}//for j
			System.out.println();
		}//for counter
		
	}// main

}// Ex5_8