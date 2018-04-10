package fundamentals.chapter2.sec5_for;
/*
 * String型の配列にを宣言し、拡張for文を使用して順番に表示させるプログラムを作成してください。
 */
public class No010 {
	public static void main(String[] args) {
		String[] str = {"aaa","bbb","ccc"};
		for (String s : str) {
			System.out.println(s);
		}
	}
}
