package fundamentals.chapter2;

/**
 * 配列
 *
 */
public class Ex005_Array {
	public static void main(String[] args) {
		int[] a; // 配列の宣言パターン1　「データ型[]△配列名;」
		int b[]; // 配列の宣言パターン2 「データ型△配列名[];」

		a = new int[3]; // 配列の生成　「配列名△=△new△データ型[要素数];」
		b = new int[5];

		a[0] = 100; // 値の代入　「配列名[要素数]△=△値;」

		/* 配列の利用 */
		System.out.println(a[0]);

		/* 配列宣言時に初期値設定 */
		int[] c = {200,300,400}; // c[0]:200, c[1]:300, c[2]:400

		System.out.println(c[0] + ":" + c[1] + ":" + c[2]);

		/* 配列の要素数を取得 */
		System.out.println(b.length);
	}
}
