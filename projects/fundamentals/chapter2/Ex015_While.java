package fundamentals.chapter2;

/**
 * while文
 *
 */
public class Ex015_While {
	public static void main(String[] args) {
		int cnt = 1;
		int sum = 0;
		while(cnt <= 10) {
			sum += cnt;
			cnt++;
		}
		System.out.println("1から10までの総和は" + sum + "です。");
	}
}