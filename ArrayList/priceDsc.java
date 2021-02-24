package ArrayList;

import java.util.Comparator;

public class priceDsc implements Comparator<menuCard> {

	@Override
	public int compare(menuCard o1, menuCard o2) {
		if(o1.price==o2.price)
		return 0;
		else if(o1.price>o2.price) return -1;
		else return 1;
		
	}
	

}
