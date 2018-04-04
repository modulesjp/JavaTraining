package fundamentals.chapter4.Ex029_override;

class StaffOv {  // スーパークラス
	String name = "名無し";
	String getName() {
		return name;
	}
}

class ManagerOv extends StaffOv {  // サブクラス
	int salary = 5000000;
	int getSalary() {
		return salary;
	}
	String getName() { // オーバーライド
		return "【マネージャー】" + name;
	}
}

public class Sample3_12 {
	public static void main(String[] args) {
		StaffOv s1 = new StaffOv();
		System.out.println("--------スーパークラス--------");
		System.out.println("名前 : " + s1.getName());  // スーパークラスで定義したメソッド
		
		System.out.println();
		ManagerOv m1 = new ManagerOv();  
		System.out.println("--------スーパークラス--------");
		System.out.println("名前 : " + m1.getName()); // サブクラスで定義したメソッド
		System.out.println("給与 : " + m1.getSalary());
	}
}
