package fundamentals.chapter4.Ex028_inheritance;

class Staff {  // スーパークラス
	String name = "名無し";
	String getName() {
		return name;
	}
}

class Manager extends Staff {  // サブクラス
	int salary = 5000000;
	int getSalary() {
		return salary;
	}
}

public class Sample3_11 {
	public static void main(String[] args) {
		Manager m1 = new Manager();  // サブクラスのインスタンス化
		System.out.println("名前 : " + m1.getName());
		System.out.println("給与 : " + m1.getSalary());
	}
}
