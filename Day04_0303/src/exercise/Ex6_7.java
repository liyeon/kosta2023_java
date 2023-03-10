package exercise;

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/*
	 * (1) 인스턴스메서드 getDistance를 작성하시오.
	 */
	double getDistance(int x, int y) {
		return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
	}//getDistance
}//MyPoint

public class Ex6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1, 1);
		// p(1,1)과 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
	}

}
//