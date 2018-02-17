package fundamentals.chapter2;

/**
 * continue文
 *
 */
public class Ex018_Continue {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}

/*
 *############################
 *# Note : 
 *# iが5の場合、
 *# 以降の処理はスキップされるが、ループは繰り返される
 *#############################
 */