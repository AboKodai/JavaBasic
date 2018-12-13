package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car[] cars = { car1, car2, car3 };
		final int distance = 300;
		car1.color = "red";
		car1.gasoline = 50;
		car2.color = "blue";
		car2.gasoline = 40;
		car3.color = "yellow";
		car3.gasoline = 45;

		for (int i = 0; i < cars.length; i++) {
			int dis = distance;
			for (int n = 1;; n++) {

				dis -= cars[i].run();
				if (cars[i].gasoline < 0) {
					System.out.println("目的地に到達できませんでした");
					break;
				} else if (dis <= 0) {
					System.out.println(
							cars[i].color + "色の車。目的地まで" + n + "時間かかりました。\n残りのガソリンは" + cars[i].gasoline + "リットルです。");
					break;
				}
			}
		}
	}
}
