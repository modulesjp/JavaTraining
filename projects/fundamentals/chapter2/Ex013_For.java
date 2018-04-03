package fundamentals.chapter2;

/**
 * for文
 *
 */
public class Ex013_For {
	public static void main(String[] args) {
		for (int x = 0; x < 10; x++) {
			System.out.println(x);
		}
		
		int y = 1; // 初期化はループ外でも可能
		for (; y <= 10; y++) {
			System.out.print(y);
		}
		
		// 条件がtrueである間は無限にループし続ける
		for (int z = 0;; z--) {
			System.out.println(z);
		}
	}
}
