package fundamentals.chapter8;

import java.io.File;

// Fileクラスのメソッド利用例
public class Sample7_2 {
	public static void main(String[] args) {
		// デフォルトとしてカレントディレクトリ
		String treeRoot = ".";
		
		if (args.length >= 1) {
			treeRoot = args[0];
		}
		File rootDir = new File(treeRoot);
		System.out.println("Root of navigation:" + rootDir.getAbsolutePath());
		// ルートディレクトリとして存在するか確認
		if (!(rootDir.isDirectory())) {
			System.out.println("The root of the navigation subtree"
					+ "does not exist as a directory!");
			System.exit(0);
		}
		Sample7_2 obj = new Sample7_2();
		obj.navigate(rootDir);
	}
	
	// 指定された抽象パスの情報取り出し
	public void navigate(File dir) {
		System.out.println(" ");
		System.out.println("Directory" + dir + ":");
		
		String[] dirContent = dir.list();
		for (int i = 0; i < dirContent.length; i++) {
			System.out.println(dirContent[i]);
			File child = new File(dir, dirContent[i]);
			if (child.isDirectory()) {
				navigate(child);
			}
		}
	}
}
