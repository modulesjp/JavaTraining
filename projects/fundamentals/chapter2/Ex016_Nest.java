package fundamentals.chapter2;

/**
 * ネストする繰り返し
 *
 */
public class Ex016_Nest {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int k = (i + 1)*(j + 1);
				System.out.print(" " + k);
			}
			System.out.println();
		}
	}
}
