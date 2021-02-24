package threading;

public class P1onThread extends Thread{

	public void run() {
		System.out.println("Running to fullest"+this.getName());
	}
	public static void main(String[] args) {
		P1onThread obj = new P1onThread();
		System.out.println("Main Method Starts");
		obj.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println("Main Method Ends");

	}

}
