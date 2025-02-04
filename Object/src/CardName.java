
public class CardName {

	public static void main(String[] args) {
		
		// 객체 생성 전에 클래스 변수 참조 가능
		System.out.println(Card.height); 
		System.out.println(Card.width);

		Card c1 = new Card(); // 객체 생성시 클래스 이름 Card가 c1의 타입이 된다. 
		Card c2 = new Card();
		
		c1.kind = "spade";
		c1.number = 5;
		
		c2.kind = "heart";
		c2.number = 8;
		
		System.out.println(c1.kind);
		System.out.println(c1.number);
		
		System.out.println(c2.kind);
		System.out.println(c2.number);
		
		c1.height = 200;
		c2.width = 200;
		
		System.out.println(c1.height);
		System.out.println(c1.width);
		
		System.out.println(c2.height);
		System.out.println(c2.width);
		
		c1.width = 100;
		
		System.out.println(c1.width);
		System.out.println(c2.width);
		
		
		
	}

}
