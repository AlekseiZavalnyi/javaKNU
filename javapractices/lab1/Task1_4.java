package org.javapractices.lab1;

public class Task1_4 {
    public String str = "1!";
	public static String static_str = "2!";

	public String getStr() {
		return str;
	}

	public void setStr(String testStr) {
		this.str = str;
	}

	public static String getStaticStr() {
		return static_str;
	}

	public static void setStaticStr(String str) {
		Task1_4.static_str = static_str;
	}
}