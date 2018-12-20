/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

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
				String strList = scanner.nextLine();
				String[] list = strList.split(",");
				pl.setPosition(list[0]);
				pl.setName(list[1]);
				pl.setCountry(list[2]);
				pl.setTeam(list[3]);
				array.add(pl);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		ArrayList<Player> GKArray = new ArrayList<>();
		ArrayList<Player> DFArray = new ArrayList<>();
		ArrayList<Player> MFArray = new ArrayList<>();
		ArrayList<Player> FWArray = new ArrayList<>();
		for (Player str : array) {
			if (str.getPosition().equals("GK")) {
				GKArray.add(str);
			} else if (str.getPosition().equals("DF")) {
				DFArray.add(str);
			} else if (str.getPosition().equals("MF")) {
				MFArray.add(str);
			} else if (str.getPosition().equals("FW")) {
				FWArray.add(str);
			}
		}
		Collections.shuffle(GKArray);
		Collections.shuffle(DFArray);
		Collections.shuffle(MFArray);
		Collections.shuffle(FWArray);
		System.out.println(GKArray.get(0));
		for (int i = 0; i < 4; i++) {
			System.out.println(DFArray.get(i));
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(MFArray.get(i));
		}
		for (int i = 0; i < 2; i++) {
			System.out.println(FWArray.get(i));
		}

	}
}
