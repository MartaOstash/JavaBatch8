package com.syntax.class12;

public class Task9 {

	public static void main(String[] args) {
		String[][] countries = { { "USA", "Canada", "Mexico" }, { "CHily", "Argentina", "Brazil" },
				{ "Ukraine", "Italy", "France" }, { "Japan", "China", "Thailand" }, { "Nigeria", "Eugypt", "Algeria" }

		};
		for (int i = 0; i < countries.length; i++) {
			for (int j = 0; j < countries[i].length; j++) {

				System.out.println(countries[i][j]);

			}

		}

		System.out.println("========================ENHANCED FOR LOOP=====================================");

		int sum = 0;
		for (String[] country : countries) {

			for (String name : country) {
				System.out.println(name + " ");
				sum++;

			}
			System.out.println();
		}
		System.out.println(sum);
	}

}
