package fundamentals.chapter8;

import java.io.File;

public class Sample7_1 {
	public static void main(String[] args) {
		File dir = new File(".");
		String listfile[] = dir.list();
		for (int i= 0; i < listfile.length; i++) {
			System.out.println(listfile[i]);
		}
	}
}
