
public class WrapperClassMain { // 2.5

	public static void main(String[] args) {
		
		// Wrapper 클래스(8개)
		// 기본형과 참조형간 형변환을 하는 클래스
		// 기본형과 Wrapper 클래스간의 형변환이 가능
		
		// int != String(상속) 상속을 전제로 기본형은 기본형끼리, 참조형은 참조형끼리 형변환이 가능하다.
		
//		기본형 -> Wrapper
//		boolean -> Boolean
//		byte -> Byte
//		short -> Short
//		char -> Character
//		int -> Integer
//		long -> Long
//		float -> Float
//		double -> Double
		
//		int i = 100;
//		Integer it;
//		it = new Integer(100); // Autoboxing
//		Integer it = i; // Autoboxing Wrapper 클래스에서의 형변환
//		Integer it = (Integer)i; (Integer) 자동생략
//		System.out.println(it); // 100
		
//		int i2 = new Integer(200); // unboxing 
//		System.out.println(i2); // 200
		
//		System.out.println(it + i2); // 300
		// 컬렉션은 기본적으로 기본형 데이터를 받지 않기 때문에 박싱이 필요하다.
		
//		Object obj = i; // new Integer(i); 자동으로 처리해준다. Autoboxing
//		System.out.println(obj); // 100
		
//		int result = obj; 안됨
//		int result = (Integer)obj; // 강제 언박싱
//		System.out.println(result); // 100
		
		// boxing의 기준은 wrapper 클래스의 기본형 8개
		
		// 숫자와 문자열의 변환 관계(casting)
		
//		int i = 100;
//		String str = String.valueOf(i); // 100 + "" 숫자를 문자열로 바꾼다
//		System.out.println(str); // 100
//		
//		String str2 = "100";
//		int i2 = Integer.parseInt(str2); // 문자열을 숫자로 바꾼다
//		System.out.println(i2); // 100
		
		
		
	}

}
