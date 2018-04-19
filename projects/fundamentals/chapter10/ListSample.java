package fundamentals.chapter10;

import java.util.ArrayList;
import java.util.List;

/*
 * Listコレクションのサンプル
 */
public class ListSample {
	public static void main(String[] args) {
		// リストコレクションの生成
		List<String> list = new ArrayList<String>();
		
		// リストへの値格納
		list.add("りんご");
		list.add("ごりら");
		list.add("らっぱ");
		
		// リストのサイズ取得
		System.out.println("コレクションのサイズ :" + list.size());
		
		// リストの出力
		System.out.println(list);
		
		
		// for文による取り出し
		for (String s  : list) {
			System.out.print(s);
			System.out.print(" → ");
		}
	}
}
