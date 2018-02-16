package projects.fundamentals.chapter2;

/**
 * break文
 *
 */
public class Ex017_Break {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
}

/*
 *############################
 *# Note : 
 *# iが5の場合はループを抜ける
 *# 以降の処理は実行されない
 *#############################
 */
