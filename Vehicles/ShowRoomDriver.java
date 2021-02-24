package Vehicles;

public class ShowRoomDriver {

	public static void main(String[] args) {
		
		Bike obj1 = new Bike("HB1","Electric",100,50000,"Honda",15,"ABS",25,"Black",2,"Sports");
		obj1.details();
		obj1.move();
		
		mopad obj2 = new mopad("HB2","Electric",100,50000,"Honda",15,"ABS",25,"Black") {
			
			public void move() {
				System.out.println("Mopad ananymous block");
			}
			
		};
		obj2.details();
		obj2.move();
		
		Lauto obj3 = new Lauto("Piegon","CNG", 500,1500000,"Bajaj",20,"Disk_Break",10,"Blue",500);
		obj3.details();
		obj3.move();
		
		Ricksha obj4 = new Ricksha("C1H2","CNG", 500,1500000,"Bajaj",20,"Disk_Break",10,"Blue",5);
		obj4.details();
		obj4.move();
		
		Car obj5 = new Car("C1H2","four wheeler","CNG", 500,1500000,"Bajaj",20,"Disk_Break",10,"Blue","sedan",6,"auto");
		obj5.details();
		obj5.move();
		
	}

}
