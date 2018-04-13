package fundamentals.chapter8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 入出力管理（ファイルの読み込み）
 */
public class Sample7_Reader {
	public static void main(String[] args) throws IOException {
		// ファイルの管理
		File file = new File("/Users/node/Work/tmp/test.txt");
		
		// ファイル読み込み用(1文字ずつ)
		FileReader r = new FileReader(file);
		// ファイルの読み込み（まとめて）
		BufferedReader br = new BufferedReader(r);
		
		// readLineメソッドで1行を取得（取得後、読み込む位置を自動的に次の行へ）
		String contents = br.readLine();
		
		// データの読み込み
		while(contents != null) {
			System.out.println(contents);
			contents = br.readLine();  // readLineで1行取得
		}
		
		br.close();
	}
}
