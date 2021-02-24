package EmployeTrackingSys;

abstract public class Bed extends Dev{
	
	//overriding work method
	public void work() {
		System.out.println("Backend Engineer");
	}
	
	Bed(String ename,double sal,int deptno,String technology){
		super(ename,sal,deptno,technology);
	}
	Bed(){
		
	}

}
