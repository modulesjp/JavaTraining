package fundamentals.chapter2;

public class Ex006_2_Enum {
	public enum Country {
		// ()で数値や文字列を持たせることが可能
		Japan(1, "日本"),
		America(2, "アメリカ"),
		Germany(3, "ドイツ"),
		
		;
		
		private int code;
		private String jpName;
		
		// コンストラクタを定義
		private Country(int code, String jpName) {
			this.code = code;
			this.jpName = jpName;
		}
		
		// メソッドを定義
		public int getCode() {
			return code;
		}
		public String getJpName() {
			return jpName;
		}
	}
	
	
	public static void main(String[] args) {
		// enumを使用
		Country jp = Country.Japan;
		System.out.println(jp.getCode());
		System.out.println(jp.getJpName());
	}
}
