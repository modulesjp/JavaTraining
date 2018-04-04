package fundamentals.chapter4.Ex026_gc;

public class GcSample {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		// 解放前の空きメモリを確認
		System.out.println(rt.freeMemory());
		// ガベージコレクタの実行
		rt.gc();
		// 解放後の空きメモリを確認
		System.out.println(rt.freeMemory());
	}
}
