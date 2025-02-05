
public class NotExistIDException extends Exception { // 2.5
// 사용자가 정의하는 예외타입. try-catch문에서 예외처리에 사용한다.
	
	public NotExistIDException(String message) {
		super(message);
	}
	
}
