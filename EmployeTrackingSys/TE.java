package EmployeTrackingSys;

abstract public class TE extends Emp{
	String domain;
	abstract public void work();
	
	TE(String ename, double sal, int deptno,String domain) {
		super(ename, sal, deptno);
		this.domain = domain;
	}
	TE(){
		
	}

	
}
