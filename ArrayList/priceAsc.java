package ArrayList;
import java.util.Comparator;
public class priceAsc implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		menuCard obj1 = (menuCard)o1;
		menuCard obj2 = (menuCard)o2;
		if(obj1.price==obj2.price) return 0;
		else if(obj1.price>obj2.price) return 1;
		else return -1;
	}

}
