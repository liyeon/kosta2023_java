package day5_0306;

class Rectangle{
	Point startPos;
	int width;
	int height;
	
	Rectangle(){
		startPos = new Point();
	}
	
	Rectangle(int x, int y, int width, int height) {
		startPos = new Point(x,y);
		this.width=width;
		this.height=height;
	}//생성자
	Rectangle(Point startPos, int width, int height){
		this.startPos = startPos;
		this.width=width;
		this.height=height;
	}
	
	Rectangle(int width, int height){
		startPos = new Point();
		this.width=width;
		this.height=height;
	}
	
	void s(){
		System.out.println("x : "+startPos.x+" y : "+startPos.y+" width : "+width+" height :"+height);
	}
}//Rectangle

public class ClassTest3 {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(10,10,20,5);//시작점(startPos) : 10, 10, 가로(width) : 20, 세로(height) : 5
		Rectangle rec2 = new Rectangle(new Point(5,5),30,10);
		Rectangle rec3 = new Rectangle();
		Rectangle rec4 = new Rectangle(30,10);
		rec1.s();
		rec2.s();
		rec3.s();
		rec4.s();
	}//
}//