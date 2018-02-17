package fundamentals.chapter2;

/**
 * ラベル
 *
 */
public class Ex019_Label {
	public static void main(String[] args) {
		label1: for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i * j > 20) {
					break label1; // iのループを終了
				}
				
				if (j % 2 == 1) { // 奇数の場合
					continue; // jのループを終了
				}
				System.out.print(i * j + " ");
			}
			System.out.println(" ");
		}
	}
}