
public class VarArgExMain {

	public static void main(String[] args) {

		concate(1,2,3,4,5);
		concate(new int[] {6,7,8,9,10}); // 배열을 생성할 수도 있다.
		
	}

	// 가변인자 메소드 : 배열 형식으로 값을 받는다
	static void concate(int... args) {
		for(int num : args) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
}
