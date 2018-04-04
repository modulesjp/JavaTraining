package fundamentals.chapter4.Ex030_this;

class Super1 {
	
}

class Super2 extends Super1 {
	
}

public class Sample {
	public static void main(String[] arsg) {
		Super1 s1 = new Super1();
		Super2 s2 = new Super2();
		s1 = s2;
	}
}
