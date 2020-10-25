package com.syntax.MYPRACTICE;

public class Array1 {

	public static void main(String[] args) {
		System.out.println("_________________________________TASK1_______________________________________");
		System.out.println("_____________WAY1____________________");
		String[] animals = { "Lion", "Elephant", "Tiger", "Bear", "Giraffe", "Snake" };
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");

		}
		System.out.println("_____________WAY2____________________");
		String[] animals1 = { "Lion", "Elephant", "Tiger", "Bear", "Giraffe", "Snake" };
		for (String animal : animals1) {
			System.out.println(animal + " ");
		}
		System.out.println("_________________________________TASK2_______ONE WAY________________________________");

		String[] countries = { "USA", "Ukraine", "Canada", "POland" };
		String[] capitals = { "Washington", "Kyiv", "Ottawa", "Warsaw" };

		for (int i = 0; i < countries.length; i++) {
			System.out.println("The capital of " + countries[i] + " is " + capitals[i]);

		}
		System.out.println("_________________________________TASK2_______ANOTHER WAY________________________________");

		String capital;
		for (String country : countries) {
			switch (country) {
			case "USA":
				capital = "DC";
				break;
			case "Ukraine":
				capital = "Kyiv";
				break;
			case "Canada":
				capital = "Ottawa";
				break;
			default:
				capital = "I dont know";

			}
			System.out.println("The capital of " + country + " is " + capital);
		}

	}

}
