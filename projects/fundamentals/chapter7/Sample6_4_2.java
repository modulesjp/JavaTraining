package fundamentals.chapter7;

public class Sample6_4_2 {
	public static void main(String[] args) {
		calledMethod();
	}
	
	static void calledMethod() {
		throw new ArithmeticException ("エラー");
	}
}
