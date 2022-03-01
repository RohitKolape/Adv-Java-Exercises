package hashset_treeset;

import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
	public static Set<Integer> checkPerfectSquare(Set<Integer> number) {

		Set<Integer> perfectsqr = new HashSet<>();
		for (Integer num : number) {
			int x = num % 10;

			if (x == 2 || x == 3 || x == 7 || x == 8) {
				continue;
			}
			for (int i = 0; i <= num / 2 + 1; i++) {

				if (i * i == num) {
					perfectsqr.add(num);
				}
			}

		}

		return perfectsqr;
	}

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();

		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);

		System.out.println(numbers);
		numbers.removeAll(checkPerfectSquare(numbers));
		System.out.println(numbers);
	}

}
