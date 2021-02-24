package ArrayList;

import java.util.Comparator;
public class fnameDsc implements Comparator<menuCard>{
	@Override
	public int compare(menuCard o1,menuCard o2) {
		return -1*o1.food.compareTo(o2.food); 
	}

}
