
public class LoginMAin { // 2.5

	public static void main(String[] args) {
		
		try {
			login("blue", "1234");
			System.out.println("�α��� ����");
		} catch (NotExistIDException | WrongPasswordException e) {
			e.printStackTrace();
		}
		
		
	}
	
	static void login(String id, String pwd) throws NotExistIDException, WrongPasswordException{
		if(!id.equals("blue")) { // ���ڿ� �� ���
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�");
		}
		
		if(!pwd.equals("1234")) { 
			throw new WrongPasswordException("��й�ȣ�� Ʋ�Ƚ��ϴ�");
		}
	}
	
}
