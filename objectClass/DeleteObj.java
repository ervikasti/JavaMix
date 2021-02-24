package objectClass;

public class DeleteObj {
	//Object is deleted by calling finalize method 
	//Object get deleted only if gc() method call the finalize method
	
	String name;
	int age;
	DeleteObj(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	DeleteObj(){
		
	}
	//Overriding finalize method
	public void finalize() {
		System.out.println("Object Deleted");
	}
	
	public static void main(String[] args) {
	//Which objects are classified for garbage collection?
		//1 Objects without the reference object
		//2 Object reference with null reference
		//3 Reinitialize object reference
		
		//Type 1
		new DeleteObj();

		
		//Type2
		DeleteObj obj1  = new DeleteObj();
		obj1 = null;
		
		//Type 3
		DeleteObj obj2 = new DeleteObj();
		DeleteObj obj3 = new DeleteObj();
		obj2 = obj3;
		
		//gc() a static method in System Class
		System.gc();
	}
}
