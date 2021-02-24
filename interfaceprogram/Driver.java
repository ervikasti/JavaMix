package interfaceprogram;

public class Driver {

	public static void main(String[] args) {
		Delloite obj1 = new Delloite();
		obj1.print();
		//upcating to interface B1
		B1 obj2 = obj1;
		obj2.print();
		//upcasting to interface A1
		A1 obj3 = obj1;
		obj3.print();

	}

}
