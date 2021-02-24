package interfacess;

public class HighSchool extends Student implements I_play,I_study,I_exam {
	
	//Implementing Play
	public void play() {
		System.out.println("HighSchool Students are Playing");
	}
	
	//Implementing Study method
	public void study() {
		System.out.println("HighSchool Guys are Studying");
	}
	
	//Implementing Exam Method
	
	public void exam() {
		System.out.println("Exam Time be silent HighSchool");
	}
	
	//Creating a constructor to create student object
	HighSchool(String sname,int rollno,float marks,int std,String medium){
		super(sname,rollno,marks,std,medium);
	}
	//Zero Parametrzed Constructor
	HighSchool(){
		
	}
}
