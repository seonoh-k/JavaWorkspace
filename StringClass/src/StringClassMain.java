
public class StringClassMain {

	public static void main(String[] args) {

//		String str1 = "abc";
//		String str2 = "abc";
//		
//		System.out.println(str1);
//		System.out.println(str2.toString());
//		
//		System.out.println(str1 == str2);
//		
//		String str3 = new String("abc");
//		String str4 = new String("abc");
//		
//		System.out.println(str3 == str4);
		
//		String str = "ab.ca.bcde";
//		String str2 = "Ab,c,de";
//		String str3 = "We are Venom";
//		
//		char ch = str.charAt(4);
//		System.out.println(ch);
//		
//		System.out.println(str.startsWith("ab")); // ���ڿ� str�� startWith�� �Ű������� �����ϴ���
//		System.out.println(str.startsWith("ac"));
//		System.out.println(str.endsWith("e"));    // ���ڿ� str�� endsWith�� �Ű������� ��������
//		System.out.println(str.endsWith("fe"));
//		
//		System.out.println(str.equals(str2));			// str�� str2�� ���� ������
//		System.out.println(str.equalsIgnoreCase(str2)); // ��ҹ��� �����ϰ� ��
//		
//		System.out.println(str.indexOf("b")); // b�� index ��ȣ. ������ ������ ��ġ��
//		System.out.println(str.indexOf("z")); // ������ -1
//		System.out.println(str.indexOf("de"));// ù��° �ε��� ��ȣ�� ��ȯ		
//		System.out.println(str.indexOf("a",2)); // �ι�° a�� �ε��� ��ȣ�� ��ȯ. ã�� ������ġ
//		
//		System.out.println(str.lastIndexOf(".")); // �ڿ������� ã�� ���
//		System.out.println(str.length()); // ���ڿ��� ����
//		System.out.println(str.replace("a", "0")); // �� �ٲٱ�
//		
//		String[] stArr = str2.split(","); // ���ڿ��� �����ڷ� �и��ؼ� �迭�� ����
//		for(String s : stArr) {
//			System.out.println(s);
//		}
		
//      split(" ")   ������ �������� ����   "Hello World".split(" ") �� ["Hello", "World"]
//      split("\\.")   .�� �������� ���� (.�� ���ԽĿ��� Ư�������̹Ƿ� \\. ���)   "ab.ca.bcde".split("\\.") �� ["ab", "ca", "bcde"]
//      split("")   �� ���ھ� ����   "Hello".split("") �� ["H", "e", "l", "l", "o"]
		
//		System.out.println(str3.substring(0, 2)); // 0~2
//		System.out.println(str3.substring(3, 6)); // 3~6
//		System.out.println(str3.substring(7));    // 7~������ ������ ��ġ�� ���ڿ��� ��ȯ
//		
//		String name = str3.substring(7);
//		int age = 10;
//		String info = String.format("%s's age is %d", name, age); // %s == name == Venom %d == age == 10
//		System.out.println(info);
		
//		String fullname = "Hello.java"; // abcedfg.hwp
//		String fullname2 = "StarCraft.exe";
//		
//		int index = fullname.indexOf("."); // ���ϸ�� Ȯ���ڸ��� ������ ������ .�� ��ġ�� ã��
//		String fileName = fullname.substring(0, index); // ���ڿ��� ���ۺ��� .�� ��ġ������ ���ϸ� ����
//		String Extension = fullname.substring(index + 1); // .�� ���� ��ġ���� ���ڿ��� ������������ Ȯ���ڸ� ����
//		System.out.println("filename is " + fileName + ", extension is " + Extension);
//		
//		String[] filename = fullname.split("\\.");
//		String fileInfo = String.format("filename is %s, extension is %s", filename[0], filename[1]);
//		System.out.println(fileInfo);
//		
//		String[] filename2 = fullname2.split("\\.");
//		String fileInfo2 = String.format("filename is %s, extension is %s", filename2[0], filename2[1]);
//		System.out.println(fileInfo2);
		
		// str = "abc";���� + "def"�� �ϴ� ��� => str = "abcdef", ���� str�� �ּҰ��� �������� ���ο� �ּҰ����� ����ȴ�. �޸� ȿ������ ����.
		// StringBuffer / StringBuilder
		// ����ȭ x, ������ / ����ȭ o, ���ſ�
		
//		StringBuffer sb = new StringBuffer("abc");
//		System.out.println(sb);
//		sb.append("def"); // sb�� �ּҰ��� �ٲ��� �ʰ� sb = "abcdef"�� ���� ����
//		System.out.println(sb);
//		
//		StringBuffer sb1 = new StringBuffer("abc");
//		StringBuffer sb2 = new StringBuffer("abc");
//		
//		System.out.println(sb1.equals(sb2)); // �ּҰ��� ��. StringBuffer���� equals�� �������̵� �Ǿ����� �ʴ�.
//		
//		String s1 = sb1.toString();
//		String s2 = sb2.toString(); // String�� ���� sb�� ���ڿ��� ����
//		
//		System.out.println(s1.equals(s2)); // String���� equals�� �������̵� �Ǿ��ֱ� ������ ���Ե� ���� ���Ѵ�.
		
	}

}
