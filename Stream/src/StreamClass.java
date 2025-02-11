import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamClass { // 2.11

	// Stream
	// �÷���, �迭 
	// ������ �ҽ��� �����̴� ���� ���� ������� �ٷ� �� �ְ� �ؼ� ���뼺�� ���ΰ�
	// ������ �ҽ��κ��� �б⸸ �� �� ���������� �ʴ´�.
	// ��ȸ��
	
	String[] strArr = {"aaa", "bbb", "ccc"};
	
//	Arrays.sort(strArr);
//	for(String s : strArr) {
//		System.out.println(s);
//	}
	
	// �Ϲ����� ����Ʈ ����
	// ArrayList<String> list = new ArrayList<>();
	
	// �迭�� ����Ʈ�� ��ȯ
	// ũ�� ������ �Ұ�����
	List<String> strList = Arrays.asList(strArr);
//	Collections.sort(strList);
//	for(String s : strList) {
//		System.out.println(s);
//	}
	
	// List�� Stream���� ��ȯ
	Stream<String> strStream1 = strList.stream();
	
	// �迭�� Stream���� ��ȯ
	Stream<String> strStream2 = Arrays.stream(strArr);
	
	// void forEach(Consumer<? super T> action);
	// T�� ��� ���� ?������ ���׸� Ÿ������ ���. ���� ����
//	strStream1.sorted().forEach(i -> System.out.println(i));
//	strStream1.sorted().forEach(System.out::println);
	
	// Stream�� ����
	// �߰� ���� : ������ �����Ϳ� ������ ���� �ʴ´�
		// distinct() : �ߺ� ����
		// filter() : ���ǿ� �ȸ´� ��Ҹ� ����
		// sort() : ����
		// map() : �ݺ��ϸ鼭 ��Ҹ� ���ϴ� ���·� ��ȯ
		// mapToInt() : int������ ��ȯ 
	// ���� ���� : ������ �����͸� ��ȭ ��Ų��
		// forEach() : ��Ҹ� �ݺ��ϸ鼭 ó��
		// count() : ����� ���� ��ȯ
		// toArray() : ��Ʈ���� ��Ҹ� �迭�� ��ȯ
	
	
}
