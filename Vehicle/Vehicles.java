
package Vehicle;

public class Vehicles {
	
	//Properties
	private String v_name;
	private String v_type;
	private String fuel_type;
	private String v_no;
	private int cc;
	private double price;
	private String comp_name;
	static int vehno = 999;
	
	//Creating  getter 
	
	public String getVname()
	{
		return this.v_name;
	}
	
	public String getVtype()
	{
		return this.v_type;
	}
	
	public String getFueltype()
	{
		return this.fuel_type;
	}
	
	public String getVno()
	{
		return this.v_no;
	}
	
	public int get_cc()
	{
		return this.cc;
	}
	
	//Getter and setter for price and comapany name
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public String getCompanyname()
	{
		return this.comp_name;
	}
	//setting comapany name
	public void setCompanyname(String cn)
	{
		this.comp_name=cn;
	}
	
	//Behaviours
	public void move()
	{
		System.out.println("I am move method");
	}
	
	public void details()
	{
		System.out.println("Vehicle name :"+this.v_name);
		System.out.println("Vehicle type :"+this.v_type);                                       		
		System.out.println("Fuel Type    :"+this.fuel_type);
		System.out.println("Vehicle No   :"+this.v_no);
		System.out.println("CC           :"+this.cc);
		System.out.println("Price        :"+this.price);
		System.out.println("Company Name :"+this.comp_name);
	}
	
	
	//generating private constructor
	
	private Vehicles(String v_name,String v_type,String fuel_type,int cc,double price,String CompName)
	{
		this.v_name = v_name;
		this.v_type = v_type;
		this.fuel_type = fuel_type;
		this.v_no  = this.v_name + ":"+ (++vehno);
		this.cc = cc;
		this.price = price;
		this.comp_name = CompName;
	}
	
	public static Vehicles createObj(String v_name,String v_type,String fuel_type,int cc,double price,String CompName) {
		return new Vehicles(v_name,v_type,fuel_type,cc,price,CompName);
	}
	
	
	

}
