
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
//		System.out.println(str.startsWith("ab")); // 문자열 str이 startWith의 매개변수로 시작하는지
//		System.out.println(str.startsWith("ac"));
//		System.out.println(str.endsWith("e"));    // 문자열 str이 endsWith의 매개변수로 끝나는지
//		System.out.println(str.endsWith("fe"));
//		
//		System.out.println(str.equals(str2));			// str과 str2가 같은 값인지
//		System.out.println(str.equalsIgnoreCase(str2)); // 대소문자 무시하고 비교
//		
//		System.out.println(str.indexOf("b")); // b의 index 번호. 지정된 문자의 위치값
//		System.out.println(str.indexOf("z")); // 없으면 -1
//		System.out.println(str.indexOf("de"));// 첫번째 인덱스 번호를 반환		
//		System.out.println(str.indexOf("a",2)); // 두번째 a의 인덱스 번호를 반환. 찾는 시작위치
//		
//		System.out.println(str.lastIndexOf(".")); // 뒤에서부터 찾는 방식
//		System.out.println(str.length()); // 문자열의 길이
//		System.out.println(str.replace("a", "0")); // 값 바꾸기
//		
//		String[] stArr = str2.split(","); // 문자열을 구분자로 분리해서 배열에 대입
//		for(String s : stArr) {
//			System.out.println(s);
//		}
		
//      split(" ")   공백을 기준으로 분할   "Hello World".split(" ") → ["Hello", "World"]
//      split("\\.")   .을 기준으로 분할 (.은 정규식에서 특수문자이므로 \\. 사용)   "ab.ca.bcde".split("\\.") → ["ab", "ca", "bcde"]
//      split("")   한 글자씩 분할   "Hello".split("") → ["H", "e", "l", "l", "o"]
		
//		System.out.println(str3.substring(0, 2)); // 0~2
//		System.out.println(str3.substring(3, 6)); // 3~6
//		System.out.println(str3.substring(7));    // 7~마지막 지정한 위치의 문자열을 반환
//		
//		String name = str3.substring(7);
//		int age = 10;
//		String info = String.format("%s's age is %d", name, age); // %s == name == Venom %d == age == 10
//		System.out.println(info);
		
//		String fullname = "Hello.java"; // abcedfg.hwp
//		String fullname2 = "StarCraft.exe";
//		
//		int index = fullname.indexOf("."); // 파일명과 확장자명을 나누는 기준인 .의 위치를 찾음
//		String fileName = fullname.substring(0, index); // 문자열의 시작부터 .의 위치까지를 파일명에 대입
//		String Extension = fullname.substring(index + 1); // .의 다음 위치부터 문자열의 마지막까지를 확장자명에 대입
//		System.out.println("filename is " + fileName + ", extension is " + Extension);
//		
//		String[] filename = fullname.split("\\.");
//		String fileInfo = String.format("filename is %s, extension is %s", filename[0], filename[1]);
//		System.out.println(fileInfo);
//		
//		String[] filename2 = fullname2.split("\\.");
//		String fileInfo2 = String.format("filename is %s, extension is %s", filename2[0], filename2[1]);
//		System.out.println(fileInfo2);
		
		// str = "abc";에서 + "def"를 하는 경우 => str = "abcdef", 기존 str의 주소값은 지워지고 새로운 주소값으로 변경된다. 메모리 효율성이 낮음.
		// StringBuffer / StringBuilder
		// 동기화 x, 가벼움 / 동기화 o, 무거움
		
//		StringBuffer sb = new StringBuffer("abc");
//		System.out.println(sb);
//		sb.append("def"); // sb의 주소값은 바뀌지 않고 sb = "abcdef"로 값을 변경
//		System.out.println(sb);
//		
//		StringBuffer sb1 = new StringBuffer("abc");
//		StringBuffer sb2 = new StringBuffer("abc");
//		
//		System.out.println(sb1.equals(sb2)); // 주소값을 비교. StringBuffer에는 equals가 오버라이딩 되어있지 않다.
//		
//		String s1 = sb1.toString();
//		String s2 = sb2.toString(); // String을 통해 sb를 문자열로 변경
//		
//		System.out.println(s1.equals(s2)); // String에는 equals가 오버라이딩 되어있기 때문에 대입된 값을 비교한다.
		
	}

}
