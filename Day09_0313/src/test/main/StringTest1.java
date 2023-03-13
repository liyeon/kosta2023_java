package test.main;

public class StringTest1 {

	public static void main(String[] args) {
		int n=10;
		
		String str1="John";//read only 영역의 주소를 있으면 가져오고 없으면 만들어서 가져온다.
		String str2="John";
		
		System.out.println(str1==str2);
		
		char[] carr = {'J', 'O', 'H', 'N'}; // 캐릭터 배열을 초기화 시켜서 스트링 새엉
		StringBuffer sb = new StringBuffer("John");
		
		String str3 = new String(str1); // String(String)
		String str4 = new String(carr); // String(char[])
		String str5 = new String(sb); // String (StringBuffer)
		
		//객체가 분리되어 있기 떄문에 false
		System.out.println(str3==str4);
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		char h = str1.charAt(2); //지정된 위치에 있는 문자열의 배열을 알려줌
		
		//charAt
		for(int i=0; i<str1.length();i++){
			System.out.print(" charAt : "+str1.charAt(i));
		}//반복문
		
		System.out.println();
		
		//concat : 문자열 뒤에 문자를 붙여서 새로운 문자열을 만들어 준다. 
		String info = str1.concat(":25");
		System.out.println(info);
		System.out.println(str1);
		
		
		// contains 특정 문자가 포함되어 있는지에 대한 여부
		System.out.println(info.contains(":"));
		
		
		//endsWith 어떤걸로 끝나는지에 대한 여부
		String filename = "news.txt";
		System.out.println(filename.endsWith("txt"));
	
		String name = "홍홍동";
		System.out.println(name.endsWith("동"));
		
		//equals 문자열이 같은지에 대해
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		//객체가 분리되어 있기 떄문에 false
		System.out.println(name1==name2);//false
		System.out.println(name1.equals(name2));//true
	
		
		//.equalsIgnoreCase 대소문자를 구분하지 않는다.
		String alph1 = new String("ABC");
		String alph2 = new String("abc");
		System.out.println(alph1.equals(alph2));//false
		System.out.println(alph2.equalsIgnoreCase(alph2));//true
		
		// indexof 특정 캐릭터가 몇번째에 존재하는지 알려준다.
		// 캐릭터가 포함되지 않으면 -1을 반환한다.
		String grace="How are you";
		System.out.println(grace.indexOf('a'));
		System.out.println(grace.indexOf('!'));
		System.out.println(grace.indexOf("you"));// <- 시작 인덱스를 반환한다
		System.out.println(grace.indexOf("tou"));//모든 문자가 맞지 않기 때문에 -1을 반환 
	
		String haha = "hahaha";
		System.out.println(haha.indexOf('h', 1));//시작 위치 지정 
		System.out.println(haha.indexOf("ha", 1));
		
		
		//replace 
		String tata=haha.replace('h', 't'); // h를 t로 바꾼다.
		System.out.println(tata);
		System.out.println(haha);//원본은 바뀌지 않는다.
		
		String momo = haha.replace("ha","mo");
		System.out.println(momo);
		
		//replaceFirst
		String fha = haha.replaceFirst("ha", "mo");//가장 앞에 있는 문자만 변경한ㄷ.
		System.out.println(fha);
		
		//split 문자열을 지정된 분리자로 나누어 문자열 배열에 담아 반환한다
		String fruitstr = "banana,apple,melon,strawberry";
		String[] fruits = fruitstr.split(",");//,로 잘라서 배열에 넣어준다.
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}//반복문
		
		//String grace= "How are you?" <- 에서 are 만 가져오고싶다.
		//내부적으로 while문을 사용한다. 시작 index와 끝 index의 앞번호 
		String are = grace.substring(4, 7);
		System.out.println(are);
		String are2 = grace.substring(4);//시작 인덱스부터 끝까지 가져온다.
		System.out.println(are2);
		
		//to LowerCase 소문자로 바꿔준다.
		String lower = "ABCDE";
		System.out.println(lower.toLowerCase());
		
		//toUpperCase 대문자로 바꿔주고
		String upper = "abcde";
		System.out.println(upper.toUpperCase());
		
		//trim  문자열 앞 뒤의 스페이스를 제거한다.
		String tstr = "     How are you    ";
		System.out.println(tstr);
		System.out.println(tstr.trim());
		
		//valueOf 지정된 값을 문자열로 변환하여 반환한다
		//숫자 100을 문자열 100으로 바꿔준다.
		// 기본형 값을 문자열로 바꿔주는 2가지 방법
		String s100 = String.valueOf(100);
		String strue = String.valueOf(true);
		String sf100 = String.valueOf(100f);
		
		//valueOf는 잘 쓰지 않는다.
		String s100_2 = 100+"";
		String strue_2=true+"";
		String sf100_2=100f+"";
		
		
		//wrapper 클래스
		//문자열을 기본형 값으로 변환하느,ㄴ 방법
		int n100 = Integer.parseInt("100");
		float f100 = Float.parseFloat("100.3");
		double d = Double.parseDouble("3.14");
		
		
		

	}//main

}//class