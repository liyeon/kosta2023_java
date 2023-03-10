package day2_0228;

public class IfTest {

	public static void main(String[] args) {
		
		int kor=40, eng=83, math=97;//
		int total = kor+eng+math;
		double avg = Math.round(total / (double)3*1000)/1000d;
		System.out.println(avg);
		
		String grade="";
		
		if(avg>=90) {
			grade = "A";
			if(avg>=97) {
				grade+="+";
			}else if(avg<=94) {
				grade+="-";
			}//중첩 if 종료
		} else if(avg>=80) {
			grade ="B";
			if(avg>=88) {
				grade+="+";
			}else if(avg<=84) {
				grade += "-";
			}//중첩 if 종료
		}else if(avg>=70) {
			grade = "C";
			if(avg>=78) {
				grade+="+";
			}else if(avg<=74) {
				grade += "-";
			}//중첩 if 종료
		}else if(avg>=60) {
			grade = "D";
			if(avg>=68) {
				grade+="+";
			}else if(avg<=64) {
				grade += "-";
			}//중첩 if 종료
		}else {
			grade = "F";
		}//grade if 종료
		
		System.out.println(
				"평균 점수 : "
				+avg+System.lineSeparator()
				+"학점 : "+grade
		);//syso 종료
		
	
	}//main 종료

}//class ifTest 종료