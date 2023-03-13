
package shape;

public class Triangle extends Shape {
	Point[] pos = new Point[3];
	public Triangle(String color) {
		super(color);//부모의 color 값 초기화
	}


	public Triangle(String color, int x1, int y1, int x2, int y2, int x3, int y3){
		super(color);
		pos[0] = new Point(x1,y1);
		pos[1] = new Point(x2,y2);
		pos[2] = new Point(x2,y3);
	}//생성자
	
	

	public Triangle(String color, Point p1, Point p2, Point p3) {
		super(color);
		pos[0]=p1;
		pos[1]=p2;
		pos[2]=p3;
	}//생성자
	public void draw() {
		System.out.println("[삼각형 : 색 - "+getColor()+", 점1 - "+pos[0]+", 점2- "+pos[1]+", 점3- "+pos[2]);

	}//draw
}// 클래스