
public class PrintArrMain {

	public static void main(String[] args) {

		PrintArr pr = new PrintArr();
		
		pr.printAll(pr.arr);
		
		pr.printSum(pr.arr);
		
		pr.printSort(pr.arr);
		
		int[] arr = pr.printSum2(pr.arr); // �޼ҵ忡�� ���� �ּҰ��� ���ο� �迭�� ����
		
		pr.printSum(arr);
		
		pr.printSort(arr);
	}

}
