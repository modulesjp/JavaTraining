package fundamentals.chapter4;

/**
 * メソッドの呼び出し
 *
 */
class MetTest {
	static void metTest1() { // staticメソッドの定義
		System.out.println("staticメソッドmetTest1");
	}
	void metTest2() { // インスタンスメソッド
		System.out.println("インスタンスメソッドmetTest2");
	}
}
public class Ex027_CallMethod {
	public static void main(String[] args) {
		MetTest.metTest1(); // クラス名.メソッド名で呼び出し可能
		// MetTest.metTest2(); クラス名ではないので不可
		
		System.out.println();
		
		MetTest mt = new MetTest(); // インスタンス化
		mt.metTest1(); // staticメソッドはこの呼び出し方でも可
		mt.metTest2(); // 参照変数名.メソッド名
	}
}
