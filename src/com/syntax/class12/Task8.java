package com.syntax.class12;

public class Task8 {

	public static void main(String[] args) {
		int[][] numbers = { { 1, 2, 3, }, { 3, 4, 2 }, { 1, 1, 1 } };
		int sum = 0;
		for (int[] rows : numbers) {
			for (int col : rows) {
				if (col % 2 != 0) {
					sum += col;
				}
			}
		}
		System.out.println(sum);

		System.out.println("---------------ANOTHER WAY-----------------");

		int sum1 = 0;
		int[][] num = { { 1, 2, 3, }, { 3, 4, 2 }, { 1, 1, 1 } };

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {

				if (num[i][j] % 2 != 0)
					sum1 += num[i][j];

			}

		}
		System.out.println(sum1);
	}
}
