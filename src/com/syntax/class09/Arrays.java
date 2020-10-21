package com.syntax.class09;

public class Arrays {

	public static void main(String[] args) {
		int a = 10;
		a = 20;

		int student1 = 90;
		int student2 = 97;
		int student3 = 85;

		// values inside array- we call elements

		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;

		// to access element from an array?

		System.out.println("Accessing 3 element " + num[2]);
		System.out.println(num[1] + num[4]);

		// I would like to change 50 to 100

		num[4] = 100;
		System.out.println("Value of 5th element after reassigning " + num[4]);

	}

}
