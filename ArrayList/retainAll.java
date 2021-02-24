package ArrayList;

import java.util.ArrayList;

public class retainAll {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("apple");
		obj.add("cat");
		obj.add("dog");
		
		ArrayList obj1 = new ArrayList();
		obj1.add("apple");
		obj1.add("horse");
		obj1.add("vampier");
		
		System.out.println(obj);
		System.out.println(obj1);
		obj.retainAll(obj1);
		
		//obj.removeAll(obj1);
		System.out.println(obj);
		System.out.println(obj1);
		
	}

}
