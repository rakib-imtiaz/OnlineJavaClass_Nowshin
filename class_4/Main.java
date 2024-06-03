package class_4;

public class Main {

	/*
	 * print : 1 -10
	 * 
	 * sum of = 1 +2 +3 + 4+........n sum of = 1 *2 *3 * 4*........n sum of = 1^2
	 * +2^2 +3^2 + 4^2+........n^2 sum of = 1^2 -2^2 -3^2 - 4^2+........-n^2 sum of
	 * = 1^2 -3^2 -5^2 - 7^2+........-(2n-1)^2 sum of = 2^2 -4^2 -6^2 -
	 * 8^2+........-(2n)^2 sum of = 1^3-2^3 +3^3-4^3.... up to n^3
	 * 
	 */

	public static void main(String[] args) {

		// printNnumbers(10, 100);
		// printNnumbersinreverse(1000, 1);
//		printEvenNnumbers(1, 100);
//		printOddNnumbers(1, 100);
//		sumOfNnumbers(10);
//		multplyOf_N_numbers(10);
//		sqaure_of_n_numbers(10);
	plus_minus(5);
	
	
	
	}

	static void sumOfNnumbers(int n) {

		int sum = 0;

		//
		for (int i = 1; i <= n; i++) {
			sum = sum + i;

			// System.out.println(i);

		}

		System.out.println("Sum is : " + sum);

	}

	static void plus_minus(int n) {
//		 * sum of = 1^3-2^3 +3^3-4^3.... up to n^3\
		double sum = 0;

		for (int i = 1; i<=n; i++) {

			if (i % 2 == 0) {
				sum = sum - Math.pow(i, 3);

			} else if (i % 2 != 0) {

				sum = sum + Math.pow(i, 3);
			}

		}
		
		System.out.println("sum : "+sum);

	}

	static void squareOfOdds(int n) {

//	 sum of = 1^2 -3^2 -5^2 - 7^2+........-(2n-1)^2

		double sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {

				sum = sum - Math.pow(i, 2);
			}

		}

		System.out.println("Sum is : " + sum);

	}

	static void multplyOf_N_numbers(int n) {

		int sum = 1;

		//
		for (int i = 1; i <= n; i++) {
			sum = sum * i;

			// System.out.println(i);

		}

		System.out.println("Multiply is : " + sum);

	}

	static void sqaure_of_n_numbers(int n) {
//		 sum of = 1^2 +2^2 +3^2 + 4^2+........n^2

		double sum = 1;

		//
		for (int i = 1; i <= n; i++) {
			sum = sum + Math.pow(i, 2);

			// System.out.println(i);

		}

		System.out.println("square is : " + sum);

	}

	static void printNnumbers(int startingPoint, int endingPoint) {

		for (int i = startingPoint; i <= endingPoint; i++) {
			System.out.println(i);

		}

	}

	static void printEvenNnumbers(int startingPoint, int endingPoint) {

		for (int i = startingPoint; i <= endingPoint; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

	static void printOddNnumbers(int startingPoint, int endingPoint) {

		for (int i = startingPoint; i <= endingPoint; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

	static void printNnumbersinreverse(int startingPoint, int endingPoint) {
		// i=1000 1000>=1

		// i=1001
		for (int i = startingPoint; i >= endingPoint; i--) {
			System.out.println(i);

		}

	}

}
