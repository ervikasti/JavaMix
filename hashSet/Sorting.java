package hashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Sorting {
	public static void main(String[] args) {
		HashSet obj = new HashSet();
		obj.add(10);
		obj.add(20);
		obj.add(280);
		obj.add(90);
		//TreeSet contains homogeneous type but they are of Object type
		//TreeSet type is decided on the basis of the first value add
		TreeSet obj1 = new TreeSet(obj);
		System.out.println(obj);
		System.out.println(obj1);
	}

}
