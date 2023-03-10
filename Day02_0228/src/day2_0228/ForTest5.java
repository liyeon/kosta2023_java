package day2_0228;

public class ForTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 *우물의 높이는 3m 
		 * 달팽이가 하루 올라갈 수 있는 거리는 55cm
		 * 달팽이가 자는 동안은 미끄러져서 13cm내려감
		 * 달팽이가 우물 탈출하는데 얼마나 며칠이 걸릴까
		 */
		
//		int height=300;
//		int day = 0;
//		int i=0, sleep=13;
//		int sum = 0;
//		
//		for(i=55;;i++) {//조건식을 뺄 수 있음
//			sum += i;
//			if(sum>=height) {
//				i-=sleep;
//				break;
//			}
//			day++;
//		}
		
		/*
		 * 올라가고
		 * 하루 추가하고
		 * 다 올라갔는지 비교하고
		 * 다 올라가지 않으면 잠
		 * */
		int clim = 0, height = 300, up = 55, down = 13, days=0;
		
		//true 무한 반복
		
		while(true) {
			clim +=up;
			days += 1;
			if(clim>=height) break;
			clim -= down;
		}
		System.out.println("달팽이가 올라가는데는"+days+"일 걸린다.");
		
	}//
}//