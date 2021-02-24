package ArrayList;

public class menuCard implements Comparable<menuCard>{
	String food;
	int price;
	float time;
	
	menuCard(String food,int price,float time){
		this.food=food;
		this.price=price;
		this.time = time;
	}
	
	public String toString() {
		return "Name : "+this.food+"    price :"+this.price;
	}
	
	//Going to delete Dupliacte objects from User defined class
	//to do so we have to override Hashcode and equals method since we will be using
	//HashSet
	public int hashCode() {
		return this.price;
	}
	
	public boolean equals(Object obj) {
		menuCard temp = (menuCard)obj;
		return this.food.equalsIgnoreCase(temp.food);
	}
	//this will do sorting of object based on price in ascending order
	public int compareTo(menuCard obj) {
		if(this.price==obj.price) return 0;
		else if(this.price > obj.price) return 1;
		else return -1;
	}
}
