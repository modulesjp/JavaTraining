package fundamentals.chapter2;

/**
 * switch文
 *
 */
public class Ex022_Switch {
	public static void main(String[] args) {
		int i = 2;
		switch(i) {
		case 1:
			System.out.println("iは1です。");
			break;
		case 2:
			System.out.println("iは2です。");
			break;
		default:
			System.out.println("iは1でも2でもありません。");
		}
	}
}
