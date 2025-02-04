
public class PrintArrMain {

	public static void main(String[] args) {

		PrintArr pr = new PrintArr();
		
		pr.printAll(pr.arr);
		
		pr.printSum(pr.arr);
		
		pr.printSort(pr.arr);
		
		int[] arr = pr.printSum2(pr.arr); // 메소드에서 받은 주소값을 새로운 배열에 대입
		
		pr.printSum(arr);
		
		pr.printSort(arr);
	}

}
