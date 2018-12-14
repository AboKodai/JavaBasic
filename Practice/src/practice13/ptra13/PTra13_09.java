/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = { "山田", "佐藤", "小林" };

	/** メールデータ（定数） */
	public static final String[] MAILDATA = { "yamada@hoge.com", "satou@hoge.com", "kobayashi@hoge.com" };

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = { "rezo0001", "rezo0002", "rezo0003" };

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
			{ "総務部", "業務部", "システム部" },
			{ "5", "10", "35" },
	};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee y = new Employee();
		Employee s = new Employee();
		Employee k = new Employee();

		for (int i = 0; i < NAMEDATA.length; i++) {
			switch (i) {
			case 0:
				y.setUserNm(NAMEDATA[i]);
				y.setMail(MAILDATA[i]);
				y.setPassword(PASSDATA[i]);
				for (int j = 0; j < QUATERDATA.length; j++) {
					switch (j) {
					case 0:
						y.setDepartmentNm(QUATERDATA[j][i]);
						break;
					case 1:
						int n = Integer.parseInt(QUATERDATA[j][i]);
						y.setDepartmentCnt(n);
						break;
					}
				}
				break;
			case 1:
				s.setUserNm(NAMEDATA[i]);
				s.setMail(MAILDATA[i]);
				s.setPassword(PASSDATA[i]);
				for (int j = 0; j < QUATERDATA.length; j++) {
					switch (j) {
					case 0:
						s.setDepartmentNm(QUATERDATA[j][i]);
						break;
					case 1:
						int n = Integer.parseInt(QUATERDATA[j][i]);
						s.setDepartmentCnt(n);
						break;
					}
				}
				break;

			case 2:
				k.setUserNm(NAMEDATA[i]);
				k.setMail(MAILDATA[i]);
				k.setPassword(PASSDATA[i]);
				for (int j = 0; j < QUATERDATA.length; j++) {
					switch (j) {
					case 0:
						k.setDepartmentNm(QUATERDATA[j][i]);
						break;
					case 1:
						int n = Integer.parseInt(QUATERDATA[j][i]);
						k.setDepartmentCnt(n);
						break;
					}
				}
				break;

			}
		}
	}
}
