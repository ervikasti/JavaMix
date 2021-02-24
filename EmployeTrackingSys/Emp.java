package EmployeTrackingSys;

import java.util.Scanner;

abstract public class Emp {
	String ename;
	private int Eid;
	
	//GetterMethod
	 public int getEid()
	 {
		 return this.Eid;
	 }
	 
	private double sal;
	
	//Getter of sal
	public double getSal()
	{
		return this.sal;
	}
	
	int deptno;
	String desgn;
	float login_time;
	float logout_time;
	static int count;
	
	//Methods
	
	
	//creating an abstract method
	abstract public void work();
	
	
	//Login Method
	public void login(float in_time )
	{
		this.login_time = in_time;
		this.logout_time = this.login_time+9.5f;
		System.out.println("U can logout at "+ this.logout_time);
	}
	
	//Logout Method
	public void logout(float out_time)
	{
		if (logout_time == out_time) {
			System.out.println("Thank you");
			
		}
		else if (out_time < logout_time) {
			System.out.println("Work till logout time");
			
		} else {
			System.out.println("On my god Overtime");

		}
	}
	
	
	//Non-static Blocks 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Login Time");
		login(sc.nextFloat());
		
	}
	Emp(){
		
	}
	
	Emp(String ename, double sal, int deptno){
		this.ename = ename;
		if (sal>10500) {
			this.sal = sal;
		}
		else {
			this.sal = 10500;
		}
		
		this.deptno = deptno;
		this.Eid = ++count;
		switch(deptno) {
		case 1 : this.desgn="MTE";
		break;
		case 2 : this.desgn = "ATE";
		break;
		case 3: this.desgn = "FED";
		break;
		case 4: this.desgn = "BED";
		break;
		default : this.desgn = "NTE" ;
		}
		}
	
	public int compareTo(Object obj) {
		Emp temp = (Emp)obj;
		if(this.equals(temp)) return 0;
		else if(this.Eid==temp.Eid)
			{	
			if(this.deptno==temp.deptno) return 0;
			
			else if(this.deptno>temp.deptno) return 1;
			else return -1;
			}
		else if (this.Eid>temp.Eid) return 1;
		else return -1;
	}
	
	public String toString() {
		return this.Eid+" "+this.deptno;
	}
	
	public boolean equals(Object obj) {
		Emp temp = (Emp)obj;
		return this.Eid==temp.Eid;
	}

}
