package fundamentals.chapter9;

public class Sample8_2 {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		String s1 = new String("abc");
		String s2 = new String("abc");
		String x1 = "abc";
		char[] data = {'a','b','c'};
		String x2 = new String(data);
		String x3 = "abc";
		
		if (a == b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (s1 == s2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (x1 == x3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
