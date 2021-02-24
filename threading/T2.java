package threading;

public class T2 implements Runnable {
	
	public void run() {
		System.out.println("Running !!");
	}
	public static void main(String[] args) {
		T2 o1 = new T2();
		Thread o2 = new Thread(o1);
		//to rename the thread we use .setName()
		o2.setName("A1");
		System.out.println("main start");
		o2.start();
		
		

	}

}
