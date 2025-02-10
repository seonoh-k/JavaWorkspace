import java.util.ArrayList;

public class Box2<T> { // 2.10

	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	 int size() {
		 return list.size();
	 }
	 
	 public String toString() {
		 return list.toString();
	 }
	
}
