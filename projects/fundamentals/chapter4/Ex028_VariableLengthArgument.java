package fundamentals.chapter4;

/**
 * 可変長パラメータ
 *
 */
class MyClass {
	public void printStuff(String greet, int...values) {
		System.out.println("--- call printStuff()");
		for (int v : values) {
			System.out.println(greet + " : " + v);
		}
	}
}
public class Ex028_VariableLengthArgument {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.printStuff("Hello", 1);
		mc.printStuff("Hey", 1,2);
		mc.printStuff("Hey you", 1,2,3);
	}
}
