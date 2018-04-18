package fundamentals.chapter10.sec1_list;

import java.util.ArrayList;
import java.util.List;

/*
 * クラス SeitoScore をつくり、名前と、点数をメンバー変数に持たせてください。
 * メソッドには名前と点数を出力するメソッドを作り、コンストラクタで生徒名と点数を設定するようにしてください。
 * No001を使って５人の生徒の情報を管理し、５０点以上の生徒だけを表示するプログラムを作成してください。
 * ※Listクラスを必ず使用すること
 */
public class No001 {
	public static void main(String[] args) {
		SeitoScore seito1 = new SeitoScore("山田太郎",80);
		SeitoScore seito2 = new SeitoScore("田中次郎",65);
		SeitoScore seito3 = new SeitoScore("森田三郎",43);
		
		List<SeitoScore> list = new ArrayList<SeitoScore>();
		list.add(seito1);
		list.add(seito2);
		list.add(seito3);
		
		for(SeitoScore i : list) {
			if (i.getScore() >= 50) {
				System.out.println("名前:" + i.getName() + " 点数:" + i.score);
			}
		}
	}
	
}

class SeitoScore {
	String name;
	int score;
	
	SeitoScore(String name, int score) {
		this.name = name;
		this.score = score;
	}
	String getName() {
		return this.name;
	}
	int getScore() {
		return this.score;
	}
}