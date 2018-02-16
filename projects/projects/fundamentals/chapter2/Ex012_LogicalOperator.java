package projects.fundamentals.chapter2;

/**
 * 論理演算子
 *
 */
public class Ex012_LogicalOperator {
	public static void main(String[] args) {
		// booleanのみ可
		int i = 5;
		boolean b;
		b = !(10 > i); // false
		b = 10 > i & 2 > i; // false (必ず左辺と右辺が実行される)
		b = 10 > i | 2 > i; // true (必ず左辺と右辺が実行される)
		b = 10 < i && 2 > i; // false (左辺が偽の場合は右辺は実行されない)
		b = 10 > i || 2 > i; // true (左辺が真の場合は右辺は実行されない)
		System.out.println(b);
	}
}
