package EmployeTrackingSys;

abstract public class Ate extends TE {
	
	//Implementing abstract work method through overriding 
	public void work() {
		System.out.println("ATE Engineer");
	}
	
	Ate(String ename,double sal,String domain){
		super(ename,sal,2,domain);
	}
	
	Ate(){
		
	}
	

}
