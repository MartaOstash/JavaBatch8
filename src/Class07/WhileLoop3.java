package Class07;

public class WhileLoop3 {
	public static void main(String[] args) {
		// print numbers 10 -30 only even

		int c = 10;

		while (c < 31) {
			if (c % 2 == 0) {

				System.out.println(c + " ");
				// c++ if we keep increment here we will get infinite loop
			}
			c++;
		}
		System.out.println("--------------------------------End of the code-------------------------------------");

		// print100 to 1 but add only

		int b = 99;
		while (b >= 1) {
			if (b % 2 == 1) {
				System.out.println(b + " ");
			}
			b--;
		}
	}

}
