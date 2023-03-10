package day2_0228;

public class ForTest4 {

	public static void main(String[] args) {
		//sum = 1+2+3+4+5+....
		//sum 값이 최초로 100이상이 될 때의 sum 값과 그때의 i값을 출력
		
		int sum=0, i;

//		while(i<100) {
//			if(sum>=100) {
//				break;	
//			}
//			sum += i;
//			i++;
//		}//while
		
//		
//		for(i=1; sum<100; i++) {//처음에 i를 ++해주고 들어가기 떄문에 출력 할 때 -1을 빼준다.
//			sum+=i;
//		}
//		
//		System.out.println("최초로 100이상이 될 때 의 값 : "+sum);
//		System.out.println("최초로 100이상이 될 때 그때의 i 값 : "+(i-1));
		/*
		break 문은 반복문안에서 사용
		switch 처럼 자기를 싸고 있는 가장 가까운 반복문을 빠져나오라는 뜻
		 */
		for(i=1;;i++) {//조건식을 뺄 수 있음
			sum += i;
			if(sum>=100) {
				break;
			}
			
		}
		System.out.println("sum : "+sum+" i:"+i);
		
	}// main

}// ForTest4