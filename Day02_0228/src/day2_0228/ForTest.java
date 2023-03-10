package day2_0228;

public class ForTest {

	public static void main(String[] args) {
		
		//1부터 10까지의 정수 더하기 
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			sum += i; //sum = sum+i;
		}//for 문 종료
		
		System.out.println("1부터 10까지의 정수의 합 : "+sum);
		
//		=====================================
		int eventot = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				eventot+=i;
			}//if문 종료
		}//for 문 종료
		System.out.println("짝수의 합 : "+eventot);
		
//		======================================
		
		int ex3dtot = 0;
//		for(int i=1; i<=100; i++) {
//			if(i%3!=0) {
//				ex3dtot +=i;
//			}//if 문 종료
//			
//		}//for 문 종료
		
//		 System.out.println("3의 배수가 아닌 수의 합 : "+ex3dtot);
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				continue;//
			}//if 문 종료
			ex3dtot +=i;
		}//for 문 종료
		
		System.out.println("3의 배수의 합 : "+ex3dtot);
	}//main

}//ForTest