
public class Point3DMain {

	public static void main(String[] args) {

		Point3D p = new Point3D(100, 20, 30);
		
//		System.out.println(p.x);
		p.printVar();
		
		String result = p.getLocation(); // 자식의 메소드 호출
		
		System.out.println(result);
	}

}
