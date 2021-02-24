package Vehicles;

public class Car extends FourWheel {
	public void move() {
		System.out.println("Car Overriding Vehical class move() method");
	}
	
	String CarType ;
	int noofseats;
	String geartype;

	public Car() {
		
	}

	public Car(String v_name, String v_type, String fuel_type, int cc, double price, String CompName, int tyre_size,
			String break_type, int milage, String color,String CarType,int noofseats,String geartype) {
		super(v_name, v_type, fuel_type, cc, price, CompName, tyre_size, break_type, milage, color);
		this.CarType=CarType;
		this.noofseats=noofseats;
		this.geartype=geartype;
		System.out.println(" Car Type       :"+this.CarType);
		System.out.println(" No of seats    :"+this.noofseats);
		System.out.println("Type of gear    :"+this.geartype);
	}

}
