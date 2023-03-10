package day2_0228;

public class SwitchTest {

	public static void main(String[] args) {
		int kor=40, eng=83, math=97;//
		int total = kor+eng+math;
		double avg = Math.round(total / (double)3*1000)/1000d;
		
		String grade="";
		switch((int)(avg/10)){
		case 10:
		case 9:{
			 grade="A";
			 if(avg>=98) {
				 grade+="+";
			 }else if(avg<=94) {
				 grade+="-";
			 }
			 break;// 빠져나오기
		}//case 9끝
		case 8: {
			 grade="B";
			 if(avg>=88) {
				 grade+="+";
			 }else if(avg<=84) {
				 grade+="-";
			 }
			 break;// 빠져나오기
		}//case 8끝
		case 7: {
			 grade="C";
			 if(avg>=78) {
				 grade+="+";
			 }else if(avg<=74) {
				 grade+="-";
			 }
			 break;// 빠져나오기
		}//case 7끝
		case 6: {
			 grade="D";
			 if(avg>=68) {
				 grade+="+";
			 }else if(avg<=64) {
				 grade+="-";
			 }
			 break;// 빠져나오기
		}//case 6끝
		
		default: grade="F";
		}//switch 종료
		System.out.println(
				"평균:"+avg+
				System.lineSeparator()+
				"학점:"+grade
				);//syso끝
	}
}