package fundamentals.chapter7;

public class Sample6_6 {
	public static void main(String[] args) {
		int x = 15;
		DataAccess da = new DataAccess();
		assert da.dataAccesible(): "Data is not acceptable";
		System.out.println("Value of x:" + x);
	}
}

class DataAccess {
	public boolean dataAccesible() {
		return false;
	}
}
