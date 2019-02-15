package bryce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Bryce Dillman <{@literal dillman19199@gmail.com}
 * 
 * Given a list of numbers and a number "winningNumber"
 * return whether any two numbers from the list ad up to 
 * the "winningNumber"
 * 
 * It also finds the pair in one pass
 * 
 */
public class PairAddition {
	private static List<Integer> numberList = Arrays.asList(10, 15, 3, 7);
	private static List<Integer> nextNumbers = new ArrayList<>();
	private static List<Integer> pair = new ArrayList<>();
	
	public static List<Integer> findPair( final List<Integer> numbers,
			final Integer winningNumber) {
		
		
		numbers.forEach(num -> {
			//get the numbers after the current number
			nextNumbers = numbers.subList(numbers.indexOf(num) + 1, numbers.size());
			//for each of those numbers, add it to the current num. if == add both to pair
			nextNumbers.forEach(nextNum -> {
				System.out.println("num " + num);
				System.out.println("nextNum " + nextNum);
				if (num + nextNum == winningNumber) {
					pair.add(num);
					pair.add(nextNum);
					return;
				}
			});
		});
		
		return pair;
	}
	
	public static void main(String[] args) {
		System.out.println(findPair(numberList, 17));
	}
}
