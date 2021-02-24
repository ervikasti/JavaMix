package Exception;

public class p1 {
	public static void move() {
		try {
			System.out.println(4/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			try {
				System.out.println(5/0);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			finally {
				System.out.println(40/0);
			}
		}
	}

}
