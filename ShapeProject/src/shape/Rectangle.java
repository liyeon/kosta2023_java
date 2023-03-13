package shape;

public class Rectangle extends Shape {
	Point start;
	int width;
	int height;
	Rectangle(){}

	Rectangle(String color) {
		super(color);
	}//생성자
	public Rectangle(String color,int x, int y, int width, int height) {
		super(color);
		start = new Point(x,y);
		this.width=width;
		this.height=height;
	}//생성자
	
	public Rectangle(String color,Point start, int width, int height){
		super(color);
		this.start = start;
		this.width=width;
		this.height=height;
	}//생성자


	public Point getStart() {
		return start;
	}


	public void setStart(Point start) {
		this.start = start;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw() {
		System.out.println("[사각형 : 색 - "+getColor()+", 시작점 - "+start+", 가로- "+getWidth()+", 세로- "+getHeight());
	}


}//클래스