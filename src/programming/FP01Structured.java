package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		System.out.println("Print All Numbers");
		printAllNumbersInListStructured(List.of(1, 2, 3, 4, 8, 6, 7, 8, 9));
		System.out.println("Print Even Numbers Only");
		printEvenNumbersInListStructured(List.of(1, 2, 3, 4, 8, 6, 7, 8, 9));
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		for (Integer number : numbers) {

			System.out.println(number);

		}
	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		for (Integer number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}

		}
	}

}
