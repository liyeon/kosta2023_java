package shape;

public class Circle extends Shape {
	
	Point center = new Point();
	int radius;// 반지름
	
	public Circle(String color) {
		super(color);
	}
	
	public Circle(String color, int x, int y, int r) {
		super(color);//부모의 생성자에서 초기화
		center = new Point(x,y);
		this.radius=r;
	}//생성자

	public Circle(String color, Point center, int r) {
		super(color);
		this.center=center;
		this.radius=r;
	}//생성자
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("[원 : 색-"+getColor()+", 중심점-"+center+", 반지름 - "+getRadius());
	}
}//class