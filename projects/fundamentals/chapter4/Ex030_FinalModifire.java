package fundamentals.chapter4;

/**
 * final修飾子
 *
 */
class FinTest {
	final int a = 15; // finalなインスタンス変数
	static final int b = 25; //finalなstatic変数
	static int c = 35; // static変数
	int d = 45; // インスタンス変数
	int e; // インスタンス変数
	
	void method() {
		int f; // ローカル変数
		System.out.println("a" + a);
		System.out.println("b" + b);
		System.out.println("c" + c);
		System.out.println("d" + d);
		System.out.println("e" + e);
		//System.out.println("f" + f); ←　変数fは自動で初期化されないためエラーとなる
	}
}
public class Ex030_FinalModifire {
	public static void main(String[] args) {
		// FinTest.b = 50; ←　bはfinalなので変更できない
		FinTest.c = 50; // finalがついていないため変更可能
		
		FinTest f = new FinTest();
		f.method();
	}
}
