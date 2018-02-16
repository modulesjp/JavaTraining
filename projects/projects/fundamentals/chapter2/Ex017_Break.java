package projects.fundamentals.chapter2;

/**
 * break文
 *
 */
public class Ex017_Break {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			cnt += 1;
			System.out.println(cnt);
			if (cnt > 5) {
				System.out.println("処理を終了");
				break;
			}
		}
	}
}
