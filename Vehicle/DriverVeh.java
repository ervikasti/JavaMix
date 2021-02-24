package Vehicle;



public class DriverVeh {

	public static void main(String[] args) {
		Vehicles obj1 = Vehicles.createObj("B22","Gearless","Petrol",125,180000,"Baja");
		obj1.move();
		obj1.details();
		
		Vehicles obj2 = Vehicles.createObj("B24","Gearless","Petrol",500,180000,"Baja");
		obj2.move();
		obj2.details();
		
		Vehicles obj3 = Vehicles.createObj("V102","Gear","Electric",25,35000,"Yahama");
		obj3.move();
		obj3.details();
	}

}
