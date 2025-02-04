
public class CaptionTv extends Tv {
//<제어자> class <자식클래스> extends <부모클래스> {}
	
	boolean caption;
	
	void diplayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	};
	
	
}
