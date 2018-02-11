package chapter2;

/**
 * 演算子
 *
 */
public class Example07_Operator {
	public static void main(String[] args) {
		/*
		 * 優先順位の例
		 */
		int a;
		a = 3 + 2 * 10; // 優先順位の高い「*」が先に計算される
		System.out.println(a);
		
		/*
		 * 結合規則の例
		 */
		int b;
		b = 4 + 5 - 3; // 左結合のため、4+5から先に計算される
		System.out.println(b);
		
		/*
		 * ▽補足
		 * 「=」も演算子の一つだが、優先順位が最も低いため最後に実行される
		 */
	}
}
