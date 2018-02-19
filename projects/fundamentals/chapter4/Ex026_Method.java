package fundamentals.chapter4;

/**
 * メソッド
 *
 */
class Teacher {
	String name;
	
	void setName(String x) {
		name = x;
	}
	
	String getName() {
		return name;
	}
}

public class Ex026_Method {
	public static void main(String[] args) {
		// 先生クラスをインスタンス化しメソッドを呼び出し名前代入
		Teacher s1 = new Teacher();
		s1.setName("佐藤さん");
		
		// 先生クラスをインスタンス化しメソッドを呼び出し名前代入
		Teacher s2 = new Teacher();
		s2.setName("田中さん");
		
		// 名前を表示
		System.out.println("名前 : " + s1.getName());
		System.out.println("名前 : " + s2.getName());
	}
}
