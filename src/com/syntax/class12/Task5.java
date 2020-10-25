package com.syntax.class12;

public class Task5 {

	public static void main(String[] args) {

		int[] array = { 1067, 90, 450, -34, 450, 1, 199 };
		int max = array[0];
		int secondMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				secondMax = max;
				max = array[i];
			} else if (array[i] > secondMax && array[i] != max) {

				secondMax = array[i];
			}
		}
		System.out.println(secondMax);

	}
}