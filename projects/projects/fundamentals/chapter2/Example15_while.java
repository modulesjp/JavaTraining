package projects.fundamentals.chapter2;

/**
 * while文
 *
 */
public class Example15_while {
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
