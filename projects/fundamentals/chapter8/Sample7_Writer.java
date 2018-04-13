package fundamentals.chapter8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 入出力管理（ファイル書き出し）
 */
public class Sample7_Writer {
	public static void main(String[] args) throws IOException {
		// ファイル管理
		File file = new File("/Users/node/Work/tmp/write.txt");
		// ファイル書き込み用ストリーム
		FileWriter w = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(w);
		
		// データの書き出し
		bw.write("書き出し文字列");
		bw.newLine();  // 改行
		
		bw.close();
	}
}
