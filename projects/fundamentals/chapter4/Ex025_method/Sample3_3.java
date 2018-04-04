package fundamentals.chapter4.Ex025_method;

class MetTest {
	static void metTest1() {
		System.out.println("staticメソッドmetTest1");
	}
	void metTest2() {
		System.out.println("インスタンスメソッドmetTest2");
	}
}

public class Sample3_3 {
	public static void main(String[] args) {
		MetTest.metTest1();
		//MetTest.metTest2();
		System.out.println("-----");
		MetTest mt = new MetTest();
		mt.metTest1();
		mt.metTest2();
	}
}
