package fundamentals.chapter8;

import java.io.File;
import java.io.IOException;

public class Sample7_1 {
	public static void main(String[] args) throws IOException {
		try {
			File f1 = new File("C:\\ocjp");
			File f2 = new File(".","temp/log.txt");
			File f3 = new File(f1, "./Sample.java");
			
			System.out.println(f1.getCanonicalPath());
			System.out.println(f2.getCanonicalPath());
			System.out.println(f3.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
