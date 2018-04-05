package fundamentals.chapter7;

public class Sample6_4 {
	public static void main(String[] args) {
		double x = 15.0;
		double y = 0.0;
		try {
			Sample6_4 obj = new Sample6_4();
			double z = obj.doubleDivide(x, y);
			System.out.println("x / y:" + z);
		} catch (ArithmeticException ae) {
			System.out.println("An exception occurred.");
			System.out.println(ae);
		}
		System.out.println("x - y:" + (x - y));
	}
	
	double doubleDivide(double x, double y) {
		if (y == 0.0) {
			throw new ArithmeticException (
				"Integer or not, please do not divide by zero!");
		} else {
			return x / y;
		}
	}
}
