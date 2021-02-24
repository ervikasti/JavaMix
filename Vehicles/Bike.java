package Vehicles;

public class Bike extends TwoWheel {
	public void move() {
		System.out.println("Bike Overriding Vehical class move() method");
	}
	
	Bike(String v_name,String fuel_type, int cc, double price, String CompName, int tyre_size,
			String break_type, int milage, String color, int noSeats, String Btype) 
	{
		super(v_name, "TwoWheeler", fuel_type, cc, price, CompName, tyre_size, break_type, milage, color, noSeats, Btype);
		
	}
	Bike()
	{
		
	}

}
