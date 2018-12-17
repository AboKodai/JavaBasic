/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				Player pl = new Player();
				String line = scanner.nextLine();
				String[] info = line.split(",");
				pl.setPosition(info[0]);
				pl.setName(info[1]);
				pl.setCountry(info[2]);
				pl.setTeam(info[3]);
				array.add(pl);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした");
		}

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		for(int i = 0; i < array.size(); i++) {
			array.remove(Predicate<"レアルマドリード">)s;
		}

//		for (Player str : array) {
//			if (str.getTeam().equals("レアル・マドリード") || str.getTeam().equals("バルセロナ")) {
//				continue;
//			}
//			System.out.println(str);
//		}

		// ★ 削除後のArrayListの中身を全件出力してください

	}
}
