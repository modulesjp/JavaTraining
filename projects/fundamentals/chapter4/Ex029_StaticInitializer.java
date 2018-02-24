package fundamentals.chapter4;

/**
 * staticイニシャライザ
 *
 */
class StaticCodeExample{
	static int counter = 0; // static変数
	static {  // staticイニシャライザ
		counter++;
		System.out.println("Static Code Block: counter:" + counter);
	}
	StaticCodeExample() {
		System.out.println("Constructor:counter:" + counter);
	}
}

public class Ex029_StaticInitializer {
	public static void main(String[] args) {
		StaticCodeExample sce1 = new StaticCodeExample();
		StaticCodeExample sce2 = new StaticCodeExample();
	}
}

/*
 * Note :
 * staticイニシャライザはクラスが初期化される前、
 * もしくはメインメソッドが呼ばれる前に処理が実行される 
 */
