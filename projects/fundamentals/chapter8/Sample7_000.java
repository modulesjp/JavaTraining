package fundamentals.chapter8;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 高レベルストリーム
 */
public class Sample7_000 {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/node/Work/tmp/test.txt");
		DataInputStream dt = new DataInputStream(new FileInputStream(file));
		String d;
		while(true) {
			d = dt.readUTF();
			System.out.println(d);
		}
	}
}
