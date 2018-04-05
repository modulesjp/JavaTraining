package fundamentals.chapter7;

public class Sample6_1 {
	public static void main(String[] args) {
		int x = 15;
		int y = 0;
		try {
			System.out.println("x / y :" + x / y);
			System.out.println("x * y :" + x * y);
		} catch(ArithmeticException ae) {
			System.out.println("ArithmeticException" + ae);
		}
		System.out.println("x - y :" + (x - y));
	}
}
