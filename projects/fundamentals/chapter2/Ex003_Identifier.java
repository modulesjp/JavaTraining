package fundamentals.chapter2;

/**
 * 識別子
 *
 */
public class Ex003_Identifier {
	public static void main(String[] args) {
		// ▼識別子の規則
		// １．Javaであらかじめ定義されている文字は使用不可
		// ２．使用できる文字は数字（0~9）、アルファベット（A~Z、a~z）、アンダースコア（_）、ドルマーク（$）
		// ３．先頭に数字は使用不可
	}
	
	/* 「public」は識別子なので、以下メソッドはコンパイルエラーが発生する
	public static public() {
		System.out.println("Hello");
	}
	*/
}
