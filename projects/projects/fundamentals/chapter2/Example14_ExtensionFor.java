package projects.fundamentals.chapter2;

/**
 * 拡張for文
 *
 */
public class Example14_ExtensionFor {
	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5};
		for (int i : intArray) { // 配列の要素分処理が繰り返される
			i = i * 3; // 要素に処理を加えたい場合などに使用
			System.out.println(i);
		}
	}
}
