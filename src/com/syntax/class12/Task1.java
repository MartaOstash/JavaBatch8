package com.syntax.class12;

public class Task1 {

	public static void main(String[] args) {
		// swap two numbers without a temporary variable

		int x = 10;
		int y = 20;

		x = y + x; // 30
		y = x - y; // 10
		x = x - y; // 20

		System.out.println(x);
		System.out.println(y);

	}

}
