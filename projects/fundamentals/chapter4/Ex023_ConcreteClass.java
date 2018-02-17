package fundamentals.chapter4;

/**
 * 具象クラス
 *
 */
public class Ex023_ConcreteClass {
	public static void main(String[] args) {
		Staff staff = new Staff(); // インスタンス化
		
		/* staffクラスのフィールド「name」に名前を指定して表示 */
		staff.name = "Staff Name";
		String str = staff.getName();
		System.out.println(str); // null
	}
	
}

// 具象クラス
class Staff { 
	String name; // フィールド（メンバ変数）
	
	String getName() { // フィールドを操作するためのメソッド
		return name; // nameを返す
	}
}

