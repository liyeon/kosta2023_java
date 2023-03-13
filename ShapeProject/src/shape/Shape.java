package shape;

public abstract class Shape {
	String color;
	Point point= new Point();
	Shape(){}
	
	Shape(String color){
		this.color=color;
	}//생성자
	

	public String getColor() {
		return color;
	}//getter

	public void setColor(String color) {
		this.color = color;
	}//setter
	
	//추상메소드
	abstract public void draw();//자식 객체를 위해 생성해준다.

}// 클래스