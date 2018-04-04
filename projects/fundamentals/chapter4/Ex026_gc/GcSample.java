package fundamentals.chapter4.Ex026_gc;

public class GcSample {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.freeMemory());
	}
}
