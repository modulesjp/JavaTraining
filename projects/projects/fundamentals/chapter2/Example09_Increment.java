package projects.fundamentals.chapter2;

/**
 * インクリメント/デクリメント
 *
 */
public class Example09_Increment {
	public static void main(String[] args) {
		int num;
		
		System.out.println("後置の場合");
		num = 10;
		System.out.println(num++);
		System.out.println(num);
		
		System.out.println("前置の場合");
		num = 10;
		System.out.println(++num);
		System.out.println(num);
		
	}
}
