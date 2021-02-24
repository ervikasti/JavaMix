package Library;

public class DriverLib {
	public static void main(String [] args)
	{
		Book obj1 = new Book("Rich Dad","Robert Kisoski",500);
		
		//calling Borrow Method
		obj1.Borrow("Vikas", "Sanjay Sir", "04-01-2020");
		obj1.Borrow("Ajay", "Sanjay Sir", "04-01-2020");
		obj1.Borrow("Anand", "Sanjay Sir", "04-01-2020");
		obj1.Borrow("Ri", "Sanjay Sir", "04-01-2020"); 
		
		//calling Return Method
		obj1.Return("Masters");
		obj1.Return("Masters 2");
		obj1.Return("Masters 3"); 
		obj1.Return("Masters 4");
	}

}
