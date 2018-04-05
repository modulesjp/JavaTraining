package fundamentals.chapter7;

import java.io.IOException;

class Sample6_5 {
	// オーバーライド対象メソッド
	// IOExceptionをthrowsしていることに注意
	public void someMethod() throws IOException {}
}

class Sample6_5_1 extends Sample6_5 {
	// スーパークラスと同じIOExceptionをスローしているのでOK
	public void someMethod() throws IOException{}
}

class Sample6_5_2 extends Sample6_5 {
	public void someMethod() {}
}

class Sample6_5_3 extends Sample6_5 {
	
}
