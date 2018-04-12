package fundamentals.chapter4;
/*
 * 修飾子
 */
public class Modifier {
	
	public int public_v;
	protected int protected_v;
	private int private_v;
	int v;
	
	public static void main(String[] args) {
		
	}
	
	public void test() {
		this.public_v =1;
		this.protected_v = 1;
		this.private_v = 1;
		this.v = 1;
	}
}