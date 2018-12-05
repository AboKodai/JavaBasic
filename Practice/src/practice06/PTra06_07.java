package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
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
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for(int n = 0; n < 10; n++) {
			switch(n) {
			case 0:
				System.out.println("□□□□□");
				break;
			case 1:
			case 9:
				System.out.println("■□□□□");
				break;
			case 2:
			case 8:
				System.out.println("■■□□□");
				break;
			case 3:
			case 7:
				System.out.println("■■■□□");
				break;
			case 4:
			case 6:
				System.out.println("■■■■□");
				break;
			case 5:
				System.out.println("■■■■■");
				break;
			}
		}

	}
}
