package fundamentals.chapter2;

/**
 * 変数
 * 基本データ型（プリミティブ型）
 */
public class Ex004_Variable {
	public static void main(String[] args) {
		int a; // 変数の宣言　「データ型△変数名;」
		a = 1203; // 値の代入　「変数△=△値;」
		
		/* 宣言と代入を1行で表現 */
		int b = 100; 
		
		/* 変数の利用 */
		System.out.println(a);
		System.out.println(b);
		
		/* 値の代入 */
		b = 200;
		System.out.println(b);
		
		/* その他のデータ型 */
		char c = 'a';
		boolean bo = true;
		
		/* Pick up
		 * 「String」は基本データ型ではない
		 */
		String str = "Hello"; // 参照型
		
		/* JavaではUnicodeが使われている */
		char u = '\u3042';
		System.out.println(u);
	}
}
