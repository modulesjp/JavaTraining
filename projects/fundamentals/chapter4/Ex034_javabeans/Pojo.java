package fundamentals.chapter4.Ex031_javabeans;

import java.io.Serializable;

public class Pojo implements Serializable {
	private String name;  // インスタンス変数
	
	public Pojo() {}  // デフォルトコンストラクタ
	public Pojo(String name) { //コンストラクタ（オーバーロード）
		this.name = name;
	}
	
	/* アクセス用関数（getter/setter） */
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
