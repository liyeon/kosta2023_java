package day4_0303;

class Data {
	int n;//new 하는 시점에 힙에 생성됨 
}//data

public class ParamTest1 {
	public static void increment1(int data) {//기본형 매개변수 : read only
		data++;
	}//increment
	
	public static void increment2(Data data) {//참조형 매개변수:. read write
		data.n++;
	}//increment2
	
	public static void increment3(int[] narr) {
		for(int i=0; i<narr.length; i++) {
			narr[i]++;
		}//for
	}//increment
	
	public static void main(String[] args) {
		Data data = new Data(); 
		data.n=10;
		
		increment1(data.n);
		System.out.println(data.n);
		
		increment2(data);
		System.out.println(data.n);
		
		int[] arr = new int[] {1,2,3,};
		increment3(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+",");
		}//for
	}//main
}//paramtest