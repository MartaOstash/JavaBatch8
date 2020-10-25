package com.ProjectTasks;

public class Task9Project {

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

		for (String[] country : countries) {
			for (String name : country) {
				System.out.println(name);
			}
		}

		System.out.println("===================TOTAL COUNTRIES STORED=============");

		int x = countries[0].length;
		int y = countries[1].length;
		int z = countries[2].length;
		int w = countries[3].length;
		int t = countries[4].length;

		int sum = x + y + z + w + t;
		System.out.println(sum);
	}

}
