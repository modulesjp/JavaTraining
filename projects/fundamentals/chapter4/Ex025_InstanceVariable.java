package fundamentals.chapter4;

/**
 * インスタンス変数・static変数・ローカル変数
 *
 */
public class Ex025_InstanceVariable {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("山田");
		employee.printEmployeeInfo();
	}
}

/* 従業員クラス */
class Employee {
	public String name; // インスタンス変数(フィールド)
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printEmployeeInfo() {
		String emp = "従業員名"; // ローカル変数
		System.out.println( emp + " : " + name); 
		System.out.println("基本給 : " + Salary.basic); //static変数はクラス名.static変数名で呼び出し可能
		// System.out.println("時間外 : " + Salary.overtime)
	}
}

/* 給与クラス */
class Salary {
	static int basic = 200000; // static変数
	public int overtime = 20000; // インスタンス変数
}