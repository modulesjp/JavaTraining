package fundamentals.chapter2;

/**
 * 列挙型
 *
 */
public class Ex006_Enum {
	/* 列挙型の作成　「修飾子△enum△列挙型名{値1,値2,値3}」 */
	public enum Color {赤,青,黄色}
	
	public static void main(String[] args) {
		/* 値の取得 */
		Color red_jp = Color.赤;
		System.out.println(red_jp);
		
		String result = check(Color.赤);
		System.out.println(result);
		
		// valuesメソッド使用例
		for (Color colors : Color.values()) {
			System.out.println(colors);
		}
	}
	
	private static String check(Color color) {
		if (color == Color.赤) {
			return "止まれ";
		} else if (color == Color.黄色) {
			return "注意して進め";
		} else if (color == Color.青) {
			return "進め";
		} else {
			return null;
		}
	}
}
