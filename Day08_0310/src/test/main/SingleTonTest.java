package test.main;
/*
 * 싱글톤 패턴
 */
class SingleArray{
	int [] array = new int[10];
	int cnt;
	
	private SingleArray() {
		// 생성자는 외부에서 호출하지못하게 private 으로 지정해야 한다
	}
	
	static SingleArray singleArray;
	
	//private 생성자를 가능하게 하려면 static 메소드로 만든다.
	
	public static SingleArray getReference() {
		
		if(singleArray==null) {
			singleArray = new SingleArray();
		}//조건문 종료
		return singleArray;
	}//
	
	
	public void setData(int data) {
		array[cnt++] = data;
	}
	
	public int getData(int idx) {
		return array[idx];
	}
}//SingleArray

public class SingleTonTest {

	public static void main(String[] args) {
		//SingleArray sa = new SinglaArray();
		SingleArray sa1 = SingleArray.getReference();
		SingleArray sa2 = SingleArray.getReference();
		SingleArray sa3 = SingleArray.getReference();

		System.out.println(sa1==sa2);
		System.out.println(sa1==sa3);
		
		//하나의 array다
		sa1.setData(10);
		System.out.println(sa2.getData(0));
	}//main
}//main