package fundamentals.chapter4.Ex031_abstract;

abstract class AbsStaff {
	String name = "名無し";
	String getName() {
		return name;
	}
	// 抽象メソッド
	abstract int getSalary();
}
class ManagerAbs extends AbsStaff {
	int salary = 5000000;
	// 抽象メソッドのオーバーライド
	int getSalary() {
		return salary;
	}
	String getName() {
		return "【マネージャー】 " + super.getName();
	}
}

public class Sample3_17 {
	public static void main(String[] args) {
		ManagerAbs m1 = new ManagerAbs();
		System.out.println("名前：" + m1.getName());
		System.out.println("給与：" + m1.getSalary());
	}
}
