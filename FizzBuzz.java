/*
 * FizzBuzz
 * Prints numbers from 1 to 100. 
 * If number is a multiple of 3, prints Fizz instead.
 * If number is a multiple of 5, prints Buzz instead.
 * If number is a multiple of both, prints FizzBuzz instead.
 *
 * Shreshth Khilani
 */

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0)
				System.out.println("FizzBuzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
	}
}