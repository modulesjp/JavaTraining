package fundamentals.chapter0;

import java.util.Random;

public class Lambda {
	public static void main(String[] args) {
		int ぜろ = 0;
		int いち = 0;
		int に = 0;
		Random r = new Random();
		for(int i = 0; i < 1000; i++) {
			int x = r.nextInt(3);
			switch(x) {
			case 0:
				ぜろ += 1;
				break;
			case 1:
				いち += 1;
				break;
			case 2:
				に += 1;
				break;
			}
		}
		System.out.println("ぜろ = " + ぜろ);
		System.out.println("いち = " + いち);
		System.out.println("に = " + に);
	}
	
}
