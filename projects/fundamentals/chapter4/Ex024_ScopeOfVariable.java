package fundamentals.chapter4;

/**
 * スコープの変数
 *
 */
public class Ex024_ScopeOfVariable {
	
	static int x = 2;
	
	public static void main(String[] args) {
		int y = 5;
		System.out.println(x + y);
	}
	
	void scopeSample() {
		for (int i = 0; i < x; i++) {
			System.out.println(i);
			// System.out.println(y); ここでは変数yは使用できない
		}
	}
}
