package exc;

//230313 추가
// 사용자 정의 예외처리 
public class BankException extends Exception {
//	public static final int DOUBLE_ID=100;
//	public static final int WITHDRAW=101;//출금
//	public static final int DEPOSIT=102;//입금
//	public static final int MENU=103;
//	public static final int ACC_MENU=104;
//	//에러코드를 임의로 입력해준다.

	// enum에서 가져온다.
	BANK_ERROR errCode;//어떤 상속값을 이름으로 정의할때 사용한다.

	// 생성자

	public BankException(String message, BANK_ERROR code) {// BANK_ERROR 로 에러 코드를 받아온다.
		super(message);// Exception의 메세지
		errCode = code;
	}// 생성자

	@Override
	public String toString() {
		String errMessage = getMessage()+":";
		
		switch(errCode) {
		case NOT_ID : errMessage+="계좌번호가 없습니다.";break;
		case DOUBLE_ID : errMessage+="중복된 계좌번호입니다.";break;
		case WITHDRAW : errMessage+="잔액이 부족합니다.";break;
		case DEPOSIT : errMessage+="입금액 오류입니다.";break;
		case MENU : errMessage+="선택하신 메뉴가 없습니다.";break;
		case ACC_MENU : errMessage+="계좌 종류를 잘못 선택했습니다.";break;
		}//switch
		
		return errMessage;
	}//오버라이드
}// 클래스