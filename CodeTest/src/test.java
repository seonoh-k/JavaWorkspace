import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class test {
	
	public static void main(String[] args) {
		
		String numbers = "011";
		
		test inst = new test();
		
		System.out.println(inst.find_prime(numbers));
	}
	
	boolean[] isPrime;
    Set<Integer> uniqueNumbers = new HashSet<>();
    
    public void prime(int max) {
    	isPrime = new boolean[max+1];
    	Arrays.fill(isPrime, true);
    	isPrime[0] = false;
    	isPrime[1] = false;
    	
    	for(int i=2; i<=max; i++) {
    		if(isPrime[i]) {
    			for(int j=i*2; j<=max; j+=i) {
    				isPrime[j] = false;
    			}
    		}
    	}
    }
    
    public void calc(String pre, String num) {
    	if(!pre.isEmpty()) {
    		int number = Integer.parseInt(pre);
    		if(isPrime[number]) {
    			uniqueNumbers.add(number);
    			System.out.println(number);
    		}
    	}
    	
    	for(int i=0; i<num.length(); i++) {
    		calc(pre + num.charAt(i), num.substring(0, i) + num.substring(i + 1));
    	}
    }
    
	public int find_prime(String num) {
		int maxNum = (int) Math.pow(10, num.length());
		prime(maxNum);
		
		calc("", num);
		System.out.println("====");
		
		return uniqueNumbers.size();
	}
	
	
    
}
