
public class TimeMain {

	public static void main(String[] args) {

//		Time t1 = new Time();
//		Time t2 = new Time();
//		Time t3 = new Time();
		String[] tt = new String[3];
		
		
		Time[] t = new Time[3];
		for(int i=0; i<t.length; i++) {
			t[i] = new Time();
//			t[i].Hour = (int)(Math.random()*24)+1;
//			t[i].Minute = (int)(Math.random()*61);
//			t[i].Seconds = (float)(Math.random()*60);
			t[i].setHour((int)(Math.random()*24));
			t[i].setMinute((int)(Math.random()*60));
			t[i].setSeconds((float)(Math.random()*60));
			if(t[i].getHour() < 12) {
				tt[i] = "AM";
			}else {
				tt[i] = "PM";
			}				
		}
		
//		for(Time time : t) {
//			System.out.println(time.Hour + ":" + time.Minute + ":" + time.Seconds);
//		}
		
//		t[0].Hour = 11;
//		t[0].Minute = 37;
//		t[0].Seconds = 34.34f;
//		t[1].Hour = 12;
//		t[1].Minute = 45;
//		t[1].Seconds = 12.67f;
//		t[2].Hour = 16;
//		t[2].Minute = 12;
//		t[2].Seconds = 58.99f;
	
		
//		System.out.println(t[0].Hour + ":" + t[0].Minute + ":" + t[0].Seconds);
//		System.out.println(t[1].Hour + ":" + t[1].Minute + ":" + t[1].Seconds);
//		System.out.println(t[2].Hour + ":" + t[2].Minute + ":" + t[2].Seconds);
		
		System.out.print(tt[0] + " " + t[0].getHour() + ":" + t[0].getMinute() + ":");
		System.out.printf("%.2f \n", t[0].getSeconds());
		System.out.print(tt[1] + " " + t[1].getHour() + ":" + t[1].getMinute() + ":");
		System.out.printf("%.2f \n", t[1].getSeconds());
		System.out.print(tt[2] + " " + t[2].getHour() + ":" + t[2].getMinute() + ":");
		System.out.printf("%.2f \n", t[2].getSeconds());
	}

}
