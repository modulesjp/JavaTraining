package fundamentals.chapter10;

import java.util.ArrayList;
import java.util.List;

/*
 * Listコレクションのサンプル
 */
public class ListSample {
	public static void main(String[] args) {
		// リストコレクションの生成
		List<String> list = new ArrayList<Book>();
		Book book1 = new Book("Java Basic",1000);
		Book book2 = new Book("ああああああ",2000);
		list.add(book1);
		list.add(book2);
		
		for(Book b : list) {
			System.out.println(b.getTitle() + b.getPrice());
		}
	}
}

class Book {
	String title;
	int price;
	
	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	// getter/setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}