package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */
		for(int n = 0; n < 5; n ++) {
			switch(n) {
			case 0:
				System.out.println("□□□□□");
				break;
			case 1:
				System.out.println("■□□□□");
				break;
			case 2:
				System.out.println("■■□□□");
				break;
			case 3:
				System.out.println("■■■□□");
				break;
			case 4:
				System.out.println("■■■■□");
				break;
			}
		}

	}
}
