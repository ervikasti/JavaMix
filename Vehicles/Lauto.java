package Vehicles;

public class Lauto extends ThreeWheel {
	public void move() {
		System.out.println("Lauto Overriding Vehical class move() method");
	}
	int loadCapacity;

	public Lauto() {

	}

	public Lauto(String v_name, String fuel_type, int cc, double price, String CompName, int tyre_size,
			String break_type, int milage, String color,int loadCapacity) 
	{
		super(v_name, "Three Wheeler", fuel_type, cc, price, CompName, tyre_size, break_type, milage, color);
		this.loadCapacity = loadCapacity;
		
	}
	
	

}
