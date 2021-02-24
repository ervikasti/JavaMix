package ArrayList;

import java.util.Comparator;
public class fnameAsc implements Comparator<menuCard>{
	@Override
	public int compare(menuCard o1,menuCard o2) {
		return o1.food.compareTo(o2.food); 
	}

}
