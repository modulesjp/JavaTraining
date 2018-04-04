package fundamentals.chapter4.Ex023_robot_production;

/*
 * ロボットクラス
 */
public class Robot {
	// インスタンス変数
	int battery = 100;  // 動くために必要なバッテリー
	
	// メソッド
	public void run(int battery) {
		this.battery -= battery;
		System.out.println("残りのバッテリーは" + this.battery + "%です。");
	}
}
