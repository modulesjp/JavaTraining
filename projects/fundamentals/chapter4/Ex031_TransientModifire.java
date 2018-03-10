package fundamentals.chapter4;

import java.io.Serializable;

/**
 * transient修飾子
 *
 */
public class Ex031_TransientModifire implements Serializable  {
	private int id;
	private String name;
	private transient String publicName;
}

/*
 * Note:
 * [transient]を持つフィールドはシリアライズの対象外として判定される
 * 
 * シリアライズ対象外とは？
 * ・追加で調べる。
 */

