
public class TvMain {

	public static void main(String[] args) {
		
		CaptionTv ct = new CaptionTv();
		
		ct.channel = 7;
		ct.channelUp();
		ct.caption = true;
		ct.diplayCaption("자막 방송중...");
		
		OttTv ot = new OttTv();
		
		ot.channel = 10;
		ot.channelDown();
		ot.ott = true;
		ot.displayOtt("Ott 접속 중");
	}

}
