package EmployeTrackingSys;

final public class finalMTE extends MTE {

	//By making class as final we make sure no one inherit it.
	//Abstraction: it is a design process in which superclass implementation
	//is hidden by giving implementation in subclass through method overriding
	finalMTE(String ename,double sal,String domain){
		super(ename,sal,domain);
	}
	
	finalMTE(){
		
	}
}
