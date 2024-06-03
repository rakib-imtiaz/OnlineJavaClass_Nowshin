package class_2;

public class play_with_methods {

	static void odd_or_even(int number) {
		if (number % 2 == 0) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}
	}

	void isAStrongPassword(String password) {

		if (password.length() > 10) {
			System.out.println("Strong");
		} else {
			System.out.println("weak password");
		}

	}

	static void positive_or_negative(int number) {
		if (number > 0) {
			System.out.println("POSITIVE");
		} else {
			System.out.println("NEGATIVE");
		}
	}

	static void namePrinter(String name) {

		System.out.println("im " + name + "!");
		System.out.println("im " + name + "!");
		System.out.println("im " + name + "!");
		System.out.println("im " + name + "!");
		System.out.println("im " + name + "!");
	}

	void age_tk_car_printer(int age, float taka, int number_of_car) {

		System.out.println("Im " + age + " Years old");
		System.out.println("I have " + number_of_car + "cars");
		System.out.println("I have " + taka + " usd");

	}

	static int sum_of_two_numbers(int a, int b) {

		int sum = a + b;

		return sum;

//		System.out.println("The sum of " + a + " and " + b + " is :" + sum);

	}
	
	static void swap(int a,int b)
	{
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+" " +b);
		
		
		
		
		
	}

}
