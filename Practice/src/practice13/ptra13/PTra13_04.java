/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;
import practice13.common.Hero;
import practice13.common.Slime;
public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero h = new Hero(25,10,7);
		Slime s = new Slime(10,5,2);
		h.setName("勇者");
		s.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

		do {
			System.out.println(h.getName() + "の攻撃");
			if(s.damage(h.attack())) {
				System.out.println("スライムは倒れた");
				break;
			}
			System.out.println(s.getName() + "の攻撃");
			if(h.damage(s.attack())) {
				System.out.println("勇者は倒れた");
				break;
			}
		}while(true);

		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		if(h.getHp() <=0 ) {
			System.out.println(s.getName() +"は" +  h.getName() +"との戦いに勝利した");
		}else if(s.getHp() <= 0) {
			System.out.println(h.getName() +"は" +  s.getName() +"との戦いに勝利した");
		}


	}
}
