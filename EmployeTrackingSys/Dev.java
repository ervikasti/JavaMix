package EmployeTrackingSys;

abstract public class Dev extends Emp {
	
	abstract public void work();
	String technology;
	Dev(){
		
	}
	Dev(String ename,double sal,int deptno,String technology){
		super(ename,sal,deptno);
		this.technology = technology;
		
	}
}
