package fundamentals.chapter4;

public class Sample3_23 {
	public static void main(String[] args) {
		Book book = new Book() {
			public void getTitle() {
				System.out.println("Java Basic");
			}
		};
		book.getTitle();
	}
}

interface Book {
	void getTitle();
}
