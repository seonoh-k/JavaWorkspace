
public class CarMain {

	public static void main(String[] args) {

		Car c1 = new Car();
		
		c1.color = "black";
		c1.gearType = "Auto";
		c1.door = 4;
		
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);
		
		System.out.println("==========");
		
		Car c2 = new Car();
		
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
		
		System.out.println("==========");
		
		Car c3 = new Car("yellow");
		
		System.out.println(c3.color);
		System.out.println(c3.gearType); // 기본값 null
		System.out.println(c3.door);     // 기본값 0
		
		System.out.println("==========");
		
		Car c4 = new Car("blue", "Manual");
		
		System.out.println(c4.color);
		System.out.println(c4.gearType);
		System.out.println(c4.door);    // 기본값 0
		
		System.out.println("==========");
		
		Car c5 = new Car("green", "Semi-Auto", 2);
		
		System.out.println(c5.color);
		System.out.println(c5.gearType);
		System.out.println(c5.door);
		
		System.out.println("==========");
		
		System.out.println("Color : " + c5.getColor() + ", GearType : " + c5.getGeartype() + ", Door : " + c5.getDoor());
		
		
	}

}
