package exercise;

public class Ex4_4 {

	public static void main(String[] args) {
		//(1)+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+5+6+7+8+9+10)
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+"   ");
				sum+=j;
				
			}//for n
			
			System.out.println(sum);
		}//for i
		
		
		System.out.println("=======================================================");
		System.out.println(sum);
	}//

}//