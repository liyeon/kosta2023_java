package test.main;

interface IClick{
	void click();
}//interface

class Button{
	IClick iclick;
	public void onClick() {
		System.out.println("버튼 눌림");
		if(iclick != null) {
			iclick.click();
		}//
	}//onClick

	public void addClickEventListner(IClick iclick) {
		this.iclick=iclick;
		
	}//addLi~
}//class


class LoginClick implements IClick{
	@Override
	public void click() {
		System.out.println("로그인 처리");		
	}//
}//

public class InterfaceTest3 {

	public static void main(String[] args) {
		Button loginBtn = new Button();
		//loginBtn.addClickEventListner(new LoginClick());
		//익명 클래스
		
		loginBtn.addClickEventListner(new IClick() {//클래스 정의(IClick인터페이스를 상속받아 추상메소드로 오버라이딩한다.) , 생성, 매개변수로 넘김 //조상 클래스를 상속받아 새로운 클래스를 만들겠다.
		
		@Override
			public void click() {
				System.out.println("로그인처리");
			}//치ㅑ차	
		});//
	}//main

}//class