
public class VCRMain {

	public static void main(String[] args) {
		
		TVCR tvcr = new TVCR();
		
//		tvcr.vcr.power();
//		tvcr.vcr.play(); 
//		tvcr.vcr.stop();
		
		tvcr.power(); // TVCR에서 VCR의 기능을 호출한 경우
		tvcr.play();
		tvcr.stop();
		
	}

}
