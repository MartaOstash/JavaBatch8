package com.syntax.MYPRACTICE;

public class Array {

	public static void main(String[] args) {

		System.out.println("___________________________TASK1_______________________________");

		char[] array = { 'A', 'B', 'C', 'D', 'E', 'F' };

		System.out.println(array[1]);

		System.out.println("___________________________TASK2_______________________________");

		String[] names = { "Marta", "Nadia", "Taras", "Olia" };
		System.out.println(names[0]);

		System.out.println("___________________________TASK3_______________________________");

		String[] words = { "Java", "Saturday", "day", "coding", "is" };
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);

		System.out.println("___________________________TASK4_______________________________");

		String[] cars = { "Audi", "BMW", "Crysler", "Mersedes", "Fiat" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i] + " ");
		}

		System.out.println("___________________________TASK5_______________________________");

		int[] number = { 1, 15, 45, 10 };
		int sum = number[0] + number[1] + number[2] + number[3];
		System.out.println(sum);

	}

}
