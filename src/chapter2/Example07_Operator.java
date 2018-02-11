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
		a = 3 + 2 * 10; // 優先順位の高い「*」が先に行われる
		System.out.println(a);
		
		/*
		 * 結合規則の例
		 */
		int b;
		b = 4 + 5 - 3;
		System.out.println(b);
	}
}
