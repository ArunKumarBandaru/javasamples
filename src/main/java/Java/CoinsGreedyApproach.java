package Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CoinsGreedyApproach {
	public static void main(String args[]) {
		int[] coins = {186,419,83,408};
		int amount = 6249;
		List<Integer> list = Arrays.stream(coins).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		for (int i = 0; i < list.size(); i++) {
			while (amount >= list.get(i)) {
				amount = amount - list.get(i);
				System.out.println("printing coins value :: "+list.get(i));
			}
		}
	}
}
