package Vehicles;

public class mopad extends TwoWheel {

	public void move() {
		System.out.println("Mopad Overriding Vehical class move() method");
	}
	
	
	mopad(String v_name,String fuel_type, int cc, double price, String CompName, int tyre_size,
			String break_type, int milage, String color) 
	{
		super(v_name, "TwoWheeler", fuel_type, cc, price, CompName, tyre_size, break_type, milage, color, 2,"mopad");
		
	}
	mopad()
	{
		
	}


}
