package fundamentals.chapter10;

import java.util.HashMap;
import java.util.Map;

/*
 * Mapコレクションのサンプル
 */
public class MapSample {
	public static void main(String[] args) {
		// マップコレクションの生成
		Map<String,String> map = new HashMap<String,String>();
		
		// マップへのキーと値格納
		map.put("日本", "Japan");
		map.put("アメリカ", "America");
		map.put("ドイツ", "Germany");
		
		
		String value = map.get("ドイツ");
		System.out.println(value);
		
//		// マップのサイズ取得
//		System.out.println("コレクションのサイズ :" + map.size());
//		// マップの出力
//		System.out.println(map);
//		
//		// for文による取り出し（値のみ）
//		for (String value : map.values()) {
//			System.out.println(value);
//		}
//		
//		// for文による取り出し（キーと値）
//		for (Map.Entry<Integer, String> entry : map.entrySet()) {
//			System.out.println("キー : " + entry.getKey() + " ,値 : " + entry.getValue());
//		}
	}
}
