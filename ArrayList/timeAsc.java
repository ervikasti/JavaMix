package ArrayList;

import java.util.Comparator;

public class timeAsc implements Comparator<menuCard> {

	@Override
	public int compare(menuCard o1, menuCard o2) {
		if(o1.time==o2.time)
		return 0;
		else if(o1.time>o2.time) return 1;
		else return -1;
		
	}
	

}
