
public class TvMain {

	public static void main(String[] args) {

		Tv tv = new Tv();
		
		tv.powerBtn();
		System.out.println("���� ����" + tv.power);

		tv.channel = 7;
		System.out.println(tv.channel);
		
		tv.channelUp();
		System.out.println(tv.channel);
		
		tv.channelDown();
		System.out.println(tv.channel);
		
		tv.powerBtn();
		System.out.println("���� ����" + tv.power);
		
		tv.color = "black";
		tv.channel = 1;
		
		tv.powerBtn();
		
		System.out.println("Tv color = " + tv.color + " Tv power = " + tv.power + " Tv channel = " + tv.channel);
		
		tv.channelUp();
		
		System.out.println("Tv color = " + tv.color + " Tv power = " + tv.power + " Tv channel = " + tv.channel);

		tv.channelDown();
		
		System.out.println("Tv color = " + tv.color + " Tv power = " + tv.power + " Tv channel = " + tv.channel);
		
		tv.powerBtn();

		System.out.println("Tv color = " + tv.color + " Tv power = " + tv.power + " Tv channel = " + tv.channel);
		
	}

}
