package fundamentals.chapter8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 低レベルストリーム
 */
public class Sample7_Stream {
	public static void main(String[] args) {
		File file = new File("/Users/node/Work/tmp/test.txt");
		try {
			FileInputStream st = new FileInputStream(file);
			int cnt;
			while((cnt = st.read()) != 10) {
				System.out.print(cnt + ":"); // バイト文字として出力される
			}
			st.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
