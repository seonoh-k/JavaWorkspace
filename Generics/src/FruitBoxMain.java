
public class FruitBoxMain { // 2.10

	public static void main(String[] args) {

		Box2<Fruit> fruitBox = new Box2<Fruit>();
		Box2<Apple> appleBox = new Box2<Apple>();
		Box2<Toy> toyBox = new Box2<Toy>();
		
		fruitBox.add(new Fruit()); // generic�� Ȱ���� ��ü ���� ����
		fruitBox.add(new Apple());
		fruitBox.add(new Grape()); // �ڽ� Ŭ������ ��ü ���� ����
		//fruitBox.add(new Toy()); // Ÿ�� �������� ���� �Ұ�.
		
		appleBox.add(new Apple());
		//appleBox.add(new Grape());
		
		toyBox.add(new Toy());
		//toyBox.add(new Fruit());
		//toyBox.add(new Apple());
		
	}

}
