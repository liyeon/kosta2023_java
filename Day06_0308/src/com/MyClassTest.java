package com; // 클래스 파일 맨 위에 package 선언

//클래스 정의 위에 import 선언
import java.sql.Date;

// 같은 패키지 내에 존재하지 않을 경우 import 해준다.
import com.kosta.MyClass;
import com.kosta.YourClass;
//kosta 밑에있는 클래스를 모두 import 해준다.
//import com.kosta.*;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mc2 = new MyClass();
		Date date = new Date(2023,3,8);
		java.util.Date date2 = new java.util.Date();
		
		YourClass ycl = new YourClass();
	}//

}//