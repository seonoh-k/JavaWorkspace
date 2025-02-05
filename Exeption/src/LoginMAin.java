
public class LoginMAin { // 2.5

	public static void main(String[] args) {
		
		try {
			login("blue", "1234");
			System.out.println("로그인 성공");
		} catch (NotExistIDException | WrongPasswordException e) {
			e.printStackTrace();
		}
		
		
	}
	
	static void login(String id, String pwd) throws NotExistIDException, WrongPasswordException{
		if(!id.equals("blue")) { // 문자열 비교 방식
			throw new NotExistIDException("아이디가 존재하지 않습니다");
		}
		
		if(!pwd.equals("1234")) { 
			throw new WrongPasswordException("비밀번호가 틀렸습니다");
		}
	}
	
}
