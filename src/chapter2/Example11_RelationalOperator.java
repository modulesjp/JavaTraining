package chapter2;

/**
 * 関係演算子
 *
 */
public class Example11_RelationalOperator {
	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		String tr = "true";
		String fa = "false";
		System.out.println((a > b) ? tr : fa);  // true
		System.out.println((a > b) ? tr : fa);  // true
		System.out.println((a < b) ? tr : fa);  // false
		System.out.println((a <= b) ? tr : fa);  // false
		System.out.println((a == b) ? tr : fa);  // false
		System.out.println((a != b) ? tr : fa);  // true
		
		/*
		 * ▽補足
		 * ?:を用いたif文は後々やるため、ここでは深く説明しない
		 * 返却値が変数またはリテラルでなければいけないため「真偽」で記述して
		 */
		
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println((str1 == str2) ? tr: fa);  // false
		System.out.println((str1.equals(str2)) ? tr: fa);  // true
		
		/*
		 * ▽説明
		 * 参照型の場合、具体的な値ではなく、オブジェクトへのアドレスを参照値として保持している
		 * 「==」は保持しているアドレスを比較しているためfalseになる
		 * 「equals()」はアドレス先のオブジェクトを比較しているためtrueになる
		 */
		
	}
}
