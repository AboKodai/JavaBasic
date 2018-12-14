package practice14.common;

public class DBCourse implements practice14.common.Course{

	String[] courseUnit = {"DB基礎", "SQL基礎", "正規化", "SQL応用"};

	public String getCourseName() {
		return "【Eラーニング】DB基礎";
	}
	public String[] getCourseUnit() {
		return courseUnit;
	}

}
