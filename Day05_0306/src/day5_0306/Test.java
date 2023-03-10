package day5_0306;

public class Test {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[2]);
		
		String operator = args[1];
		
		switch(operator) {
		case "+" : System.out.println(x+y); break;
		case "-" : System.out.println(x-y); break;
		}//switch
		
		
//		for(int i=0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}//for

	}//main

}//class Test