package fundamentals.chapter7;

import java.io.IOException;

public class Sample6_4_2 {
	public static void main(String[] args) {
		calledMethod();
	}
	
	static void calledMethod() throws IOException {
		throw new IOException();
	}
}
