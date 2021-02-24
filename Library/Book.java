package Library;

public class Book {

	String bname;
	int srno;
	String author;
	float price;
	static int autoincrement;
	static int count = 3;
	
	//Methods
	
	//Implementing Borrow Behaviour 
	public void Borrow(String Sname,String issued_by, String date_of_borrow)
	{
		if(count>0)
		{
			count--;
			System.out.println("Student "+Sname);
			System.out.println("Issued by "+issued_by);
			System.out.println("Book "+this.bname);
			System.out.println("Copies remaining "+count);
			
		}
		else
		{
			System.out.println("Return a book to issue it");
		}
	}
	
	//Return Method
	public void Return(String bname) {
		if(count>=3)
		{
			System.out.println("Invalid book");
		}
		else
		{
			count++;
			System.out.println("Booked returned "+bname);	
		}
		
	}
	
	Book(String bname,String author, float price)
	{
	 this.bname = bname;
	 this.srno  = ++autoincrement;
	 this.author = author;
	 this.price = price;
	}
	
}
