package fundamentals.chapter8;

import java.io.File;
import java.io.IOException;

public class Sample7_0 {
	public static void main(String[] args) throws IOException {
		
		// Fileオブジェクトの生成
		File dir = new File("c:\\training\\Hello.java");
		
		// Fileクラスのメソッド使用例
		// createNewFile()  ・・・  ファイルが存在しなければ新規作成
		if (dir.createNewFile()) {
			System.out.println(dir.getName() + "を新規作成しました。");
		} else {
			System.out.println("既に存在します。");
		}
		
		// getAbsolutePath()  ・・・  ファイルまでのパスを返す
		System.out.println(dir.getAbsolutePath());
		
	}
}
