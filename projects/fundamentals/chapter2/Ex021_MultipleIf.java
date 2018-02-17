package fundamentals.chapter2;

/**
 * 複数のif文
 *
 */
public class Ex021_MultipleIf {
	public static void main(String[] args) {
		int score = 70;
		
		if (score < 30) {
			System.out.println("不合格");
		} else if (score < 70) {
			System.out.println("追試");
		} else {
			System.out.println("合格");
		}
	}
}
