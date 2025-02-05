import java.util.InputMismatchException;
import java.util.Scanner;

public class CalMain { // 2.5

	public static void main(String[] args) {

		int num1, num2, result = 0;
		String oper;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("숫자를 두개 입력하세요");
			
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.println("연산자 입력 : ");
			
			oper = sc.next();
			
			if(oper.equals("+")) {
				result = num1 + num2;
			}else if(oper.equals("-")) {
				result = num1 - num2;
			}else if(oper.equals("*")) {
				result = num1 * num2;
			}else if(oper.equals("/")) {
				result = num1 / num2;
			}
			
			System.out.println("연산 결과 : " + result);			
			
		}catch(InputMismatchException e) {
			System.out.println("값의 정보가 부정확합니다.");
		}catch(NumberFormatException e) {
			System.out.println("정수를 입력하세요");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}catch(Exception e) {
			System.out.println("값의 정보가 부정확합니다");
		}finally {
			sc.close();
		}
	}

}

//`InputMismatchException`은 Java의 `java.util` 패키지에 속한 예외이기 때문에 다른 예외들과는 다르게 특정 패키지를 임포트해야 합니다. 
//
//자세히 설명하자면:
//
//1. **`InputMismatchException`**은 `java.util` 패키지에 속한 클래스입니다. 예를 들어, `Scanner` 클래스에서 입력을 받을 때 입력 값이 예상한 타입과 맞지 않으면 이 예외가 발생합니다. 그러므로 `InputMismatchException`을 사용하려면 `java.util` 패키지를 임포트해야 합니다.
//
//2. **다른 예외들**은 대부분 `java.lang` 패키지에 기본적으로 포함되어 있기 때문에 따로 임포트할 필요가 없습니다. 예를 들어, `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException` 등은 모두 `java.lang` 패키지에 포함되어 있어 자동으로 접근 가능합니다.
//
//따라서, `InputMismatchException`만 따로 임포트하는 이유는 그것이 다른 예외들과 다른 패키지에 존재하기 때문입니다. 반면, `java.lang` 패키지에 포함된 예외들은 자동으로 사용할 수 있기 때문에 임포트가 필요 없는 것입니다.
