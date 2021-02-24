package interfacess;

public class Student {
	String sname;
	int rollno;
	float marks;
	int std;
	String medium;
	
	//Creating a parameterized constructor
	Student(String sname,int rollno,float marks,int std,String medium){
		this.sname = sname;
		this.rollno = rollno;
		this.marks = marks;
		this.std = std;
		this.medium = medium;
	}
	
	//Making Default constructor
	Student(){
		
	}
}
