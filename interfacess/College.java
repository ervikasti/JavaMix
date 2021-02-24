package interfacess;

public class College extends Student implements I_study,I_exam {
	//Implementing study method
	public void study() {
		System.out.println("College: Study Time people");
	}
	//Implements exam method
	public void exam() {
		System.out.println("College : Exam Time pindrop silence");
	}
	
	//Calling Constructor
	College(String sname,int rollno,float marks,int std,String medium){
		super(sname,rollno,marks,std,medium);
	}
	//Zero parameterized
	College(){
		
	}

}
