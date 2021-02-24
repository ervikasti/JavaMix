package EmployeTrackingSys;

import java.util.ArrayList;

public class DriverEmp {

	public static void main(String[] args) {
		finalMTE obj = new finalMTE("V",105000,"TESTING");
		System.out.println(obj.getSal());
		obj.logout(20);
		obj.work();
		
		/*
		Ate obj1 = new Ate("S",10,"Testing");
		obj1.work();
		obj1.logout(21);*/
		
		//Why this is working since ATe is an abstract class?
		Ate obj2 = new Ate("SS",50,"TESTING") {
			public void work() {
				System.out.println("This is ananymous Block Calling");
			}
		};
		obj2.work();
		obj2.logout(53);
		ArrayList a1 = new ArrayList();
		a1.add(new finalMTE("V",105000,"TESTING"));
		a1.add(new finalMTE("V",105089,"TESTING"));
		a1.add(new finalMTE("V",10,"TESTING"));
		a1.add(new finalBed("VV",502,"MongoDB"));
		System.out.println(a1);
		
		

	}

}
