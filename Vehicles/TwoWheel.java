package Vehicles;

public class TwoWheel extends Vehicles {
	int noSeats;
	String Btype;

	TwoWheel(String v_name, String v_type, String fuel_type, int cc, double price, String CompName, int tyre_size,
			String break_type, int milage, String color,int noSeats,String Btype)
	{
		super(v_name, v_type, fuel_type, cc, price, CompName, tyre_size, break_type, milage, color);
		this.noSeats=noSeats;
		this.Btype = Btype;
	}
	
	public void details() {
		super.details();
		System.out.println("Noseats      :"+this.noSeats);
		System.out.println("Btypes       :"+this.Btype);
		
	}
	
	TwoWheel()
	{
		
	}
	

}
