package Vehicles;

public class Ricksha extends ThreeWheel {
	
	public void move() {
		System.out.println("Rickash Overriding Vehical class move() method");
	}
	int seat_capacity;

	public Ricksha() {
		
	}

	public Ricksha(String v_name, String fuel_type, int cc, double price, String CompName, int tyre_size,
			String break_type, int milage, String color,int seat_capacity)
	{
		super(v_name,"Three wheeler", fuel_type, cc, price, CompName, tyre_size, break_type, milage, color);
		this.seat_capacity=seat_capacity;
		System.out.println("Seat capacity    :"+this.seat_capacity);
	}
	

}
