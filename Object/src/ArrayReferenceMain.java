
public class ArrayReferenceMain {

	public static void main(String[] args) {

		int[] arr = {10};
 		
		System.out.println("변경전 arr[0] = " + arr[0]);
		
		change(arr);
		
		System.out.println("변경후 arr[0] = " + arr[0]);
	}

	
	static void change(int[] arr) {
		arr[0] = 1000;
		System.out.println("change arr[0] = " + arr[0]);
	}
}
