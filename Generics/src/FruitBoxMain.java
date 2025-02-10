
public class FruitBoxMain { // 2.10

	public static void main(String[] args) {

		Box2<Fruit> fruitBox = new Box2<Fruit>();
		Box2<Apple> appleBox = new Box2<Apple>();
		Box2<Toy> toyBox = new Box2<Toy>();
		
		fruitBox.add(new Fruit()); // generic을 활용해 객체 생성 가능
		fruitBox.add(new Apple());
		fruitBox.add(new Grape()); // 자식 클래스로 객체 생성 가능
		//fruitBox.add(new Toy()); // 타입 제한으로 생성 불가.
		
		appleBox.add(new Apple());
		//appleBox.add(new Grape());
		
		toyBox.add(new Toy());
		//toyBox.add(new Fruit());
		//toyBox.add(new Apple());
		
	}

}
