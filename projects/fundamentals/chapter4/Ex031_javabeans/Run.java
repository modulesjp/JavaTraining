package fundamentals.chapter4.Ex031_javabeans;

public class Run {
	public static void main(String[] args) {
		Pojo bean = new Pojo();
		bean.setName("山田");
		
		System.out.println("私の名前は" + bean.getName() + "です。");
	}
}
