package chapter2;

/**
 * 列挙型
 *
 */
public class Example06_Enum {
	/* 列挙型の作成　「修飾子△enum△列挙型名{値1,値2,値3}」 */
	public enum Color {RED,BLUE,YELLOW}
	
	public static void main(String[] args) {
		/* 値の取得 */
		Color red = Color.RED;
		System.out.println(red);
		
		/* すべて取得 */
		Color[] color = Color.values();
		System.out.println(color[2]);
		
		/* 使用例 */
		System.out.println(jpColor(Color.RED));
		
	}
	
	public static String jpColor(Color color) {
		switch(color) {
		case RED:
			return "赤";
		case BLUE:
			return "青";
		case YELLOW:
			return "黄";
		default:
			throw new AssertionError(color + "はありません。");
		}
	}
}
