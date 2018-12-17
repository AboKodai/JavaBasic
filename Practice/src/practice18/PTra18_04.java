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
		try(Scanner scanner  = new Scanner(new File("file/BestElevenCandidate.csv"))){
			while(scanner.hasNext()) {
				Player pl = new Player();
				String strList = scanner.nextLine();
				String[] list = strList.split(",");
				pl.setPosition(list[0]);
				pl.setName(list[1]);
				pl.setCountry(list[2]);
				pl.setTeam(list[3]);
				array.add(pl);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした");
		}


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください


	}
}
