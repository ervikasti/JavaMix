package EmployeTrackingSys;

abstract public class Fed extends Dev{
	
	//overriding work method
	public void work() {
		System.out.println("Front End Engineer");
	}
	
	Fed(String ename,double sal,int deptno,String technology){
		super(ename,sal,3,"Angular JS");
	}
	Fed(){
		
	}

}
