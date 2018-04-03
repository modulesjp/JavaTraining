package fundamentals.chapter2;

/**
 * 列挙型を使用しない例
 *
 */
public class Ex006_1_Enum {
	public static void main(String[] args) {
		String result = check("赤");
		System.out.println(result);
	}
	
	private static String check(String color) {
		if (color == "赤" ) {
			return "止まれ";
		} else if (color == "黄色") {
			return "注意して進め";
		} else if (color == "青") {
			return "進め";
		} else {
			return null;
		}
	}
}
