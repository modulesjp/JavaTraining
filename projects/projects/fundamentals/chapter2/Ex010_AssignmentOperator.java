package projects.fundamentals.chapter2;

/**
 * 代入演算子/複合演算子
 *
 */
public class Ex010_AssignmentOperator {
	public static void main(String[] args) {
		/*
		 * 代入演算子
		 */
		int num;
		num = 5; // num = 5
		
		/*
		 * 算術演算子　+ 代入演算子
		 */
		num += 2; // num = 7
		num -= 3; // num = 4
		num *= 2; // num = 8
		num /= 2; // num = 4
		num %= 3; // num = 1
		System.out.println(num);
		System.out.println("--------");
		
		/*
		 * シフト演算子　+　代入演算子 
		 */
		byte i = 100;
		System.out.println("初期値　：　" + Integer.toString(i,2)); // 1100100
		System.out.println(i);
		
		i >>>= 2; // 右に2シフトする
		
		System.out.println("右に2シフト　：　" + Integer.toString(i,2)); // 0011001
		System.out.println(i);
		
		i <<= 2;
		
		System.out.println("左に2シフト　：　" + Integer.toString(i,2)); // 1100100
		System.out.println(i);
		
		i >>= 2;
		
		System.out.println("右に2シフト　：　" + Integer.toString(i,2)); // 0011001
		System.out.println(i);
		System.out.println("--------");
		
		/*
		 * その他の複合演算子
		 */
		boolean b = true;
		b &= false; // 両方がTrueの場合にtrueを返す
		System.out.println(b); //false
		
		b |= true; // 片方がTrueの時にtrueを返す
		System.out.println(b); // true
		
		b ^= false; // 両方が異なる場合にtrueを返す
		System.out.println(b); // true
		
	}
}
