package interfacess;

public class DriverInterface {
	public static void main(String[] args) {
		PrimarySchool obj1 = new PrimarySchool("PS",1,20,1,"ENG");
		obj1.play();
		System.out.println(obj1.sname);
		
		//
		HighSchool obj2 = new HighSchool("HS",2,20,8,"SANSKRIT");
		obj2.play();
		obj2.study();
		obj2.exam();
		System.out.println(obj2.sname);
		
		//Object of College
		College obj3 = new College("CL",15,20,12,"GERMANY");
		obj3.study();
		obj3.exam();
		System.out.println(obj3.sname);
		
		//Upcasting Primary School to play
		I_play obj4 = obj1;
		obj4.play();
		
		//Parent class type casting to another parent class
		//WE should have a common child class to do this 
		I_exam obj5 = (I_exam)obj3;
		obj5.exam();
		
	}

}
