package com.syntax.class12;

public class Task3 {

	public static void main(String[] args) {
		// Fibonacci first 10 min 0 1 2 3 5 8 13 21 34

		int a = 0;
		int b = 1;
		int sum;

		for (int i = 1; i <= 10; i++) {
			System.out.print(a + " ");
			sum = a + b;
			a = b;
			b = sum;
		}

	}

}
