package fundamentals.chapter7;

public class Sample6_2 {
	public static void main(String[] args) {
		int x = 15;
		int y = 0;
		try {
			System.out.println("x / y :" + x / y);
			System.out.println("x * y :" + x * y);
		} catch(ArrayIndexOutOfBoundsException oe) {
			System.out.println("ArithmeticException" + oe);
		} finally {
			System.out.println("finally block must be executed!");
		}
		System.out.println("x - y :" + (x - y));
	}
}
