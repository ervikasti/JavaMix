package interfacess;

public class PrimarySchool extends Student implements I_play {
	
	public void play() {
		System.out.println("Childrens are playing");
	}
	
	//Creating Constructor of PrimarySChool
	PrimarySchool(String sname,int rollno,float marks,int std,String medium){
		super(sname,rollno,marks,std,medium);
		
	}
	

}
