package lamdaExpression;

//lambda expression are used to give implementation
//to Formal interfaces without creating subclass  
public class lamda implements Student{
	public static void main(String[] args) {
		Student obj = () -> {
			System.out.println("Hi how are you.");
		};
		obj.stu();
	}
	
}
