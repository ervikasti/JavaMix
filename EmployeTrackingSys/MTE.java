package EmployeTrackingSys;

abstract public class MTE extends TE {
	//Implementing abstract work method through overriding
	public void work() {
		System.out.println("MTE Engineer");
	}
	
	MTE(String ename,double sal,String domain){
		super(ename,sal,1,domain);
		
	}
	MTE()
	{
		
	}
}
