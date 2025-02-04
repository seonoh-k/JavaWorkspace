import java.util.Arrays;

public class PrintArr {

	int[] arr = {2,5,3,1,4};
	
	void printAll(int[] arr) {
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	int[] printSum2(int[] arr) {
		return arr; // 참조변수(reference)의 주소값을 반환
	}
	
	void printSum(int[] arr) { // 합계
		int sum1 = 0;
		for(int sum : arr) {
			sum1 += sum;
		}
		System.out.println(sum1);
	}
	
	void printSort(int[] arr) { // 오름차순
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp;
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		// 위의 방식이 순차적으로 비교하는 횟수를 줄여 메모리 낭비가 적다.
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					int tmp;
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
		System.out.println(Arrays.toString(arr));
	}
	

}
