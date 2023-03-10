package exercise;

public class Ex5_8_d {

	public static void main(String[] args) {
		
		int[] correct= { 4, 1, 2, 3, 4, 1, 2, 3, 3, 1 }; // 문제에 대한 정답 
		int[] answer = { 4, 2, 1, 3, 2, 1, 2, 4, 3, 1 }; // 시험을 제출한 사람의 답안지
		
		//초기화
		int score = 0; // 정답수 
		
		//false
		System.out.println(correct[1]==answer[1]);
		
		for(int i=0; i<answer.length; i++) {
			if(answer[i] == correct[i]) {
				score++;//score = score+1
			}//if
		}//for answer
		
		System.out.println("학생이 맞은 정답은 "+score+" 개");
		
		//맞은 답 수 : 6

	}// main
}// Ex5_8