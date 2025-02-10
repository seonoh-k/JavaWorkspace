
public class FruitBox2Main { // 2.10

	public static void main(String[] args) {

		FruitBox<Fruit> fruitBox = new FruitBox();
		FruitBox<Apple> appleBox = new FruitBox();
		FruitBox<Grape> grapeBox = new FruitBox();
		//FruitBox<Toy> toyBox = new FruitBox(); // ���� ���ѿ� �ɷ��� ��� �Ұ���
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape()); // �ڽ� Ŭ���� ���� ����
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		
		System.out.println(fruitBox.toString());
		System.out.println(appleBox.toString());
		System.out.println(grapeBox.toString());
		
	}

}
