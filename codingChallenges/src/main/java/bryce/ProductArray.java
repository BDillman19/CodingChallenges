package bryce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * 
 * @author Bryce Dillman <{@literal dillman19199@gmail.com}
 *
 *Given an array of integers, return a new array such that
 * each element at index i of the new array is the product 
 * of all the numbers in the original array except the one at i
 * 
 * this is done without using division and with using division
 * because the without division this problem become much more
 * difficult.
 *
 */
public class ProductArray {
	private static List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
	private static List<Integer> otherNumbers;
	private static List<Integer> tempList;
	private static List<Integer> productArray;
	private static Integer indexOfCurrentNumber;
	private static Integer runningTotal;
	
	public static List<Integer> makeProductArrayWithoutDivision(final List<Integer> numbers) {
		productArray = new ArrayList<>();
		
		numbers.forEach(currentNum -> {
			runningTotal = 1;
			tempList = new ArrayList<>();
			otherNumbers = new ArrayList<>();
			//get index of num
			indexOfCurrentNumber = numbers.indexOf(currentNum);
			switch (indexOfCurrentNumber) {
			case 0:
				tempList = numbers.subList(indexOfCurrentNumber + 1, numbers.size());
				tempList.forEach(num -> otherNumbers.add(num));
				break;
			default:
				tempList = numbers.subList(0,indexOfCurrentNumber);
				tempList.forEach(num -> otherNumbers.add(num));
				tempList = numbers.subList(indexOfCurrentNumber + 1, numbers.size());
				tempList.forEach(num -> otherNumbers.add(num));
			}
			
			otherNumbers.forEach(num -> {
				runningTotal *= num;
			});
			productArray.add(runningTotal);

		});
		
		return productArray;
	}
	
	public static List<Integer> makeProductArrayWithDivision(final List<Integer> numbers) {
		runningTotal = 1;
		productArray = new ArrayList<>();
			
		numbers.forEach(num -> {
			runningTotal *= num;
		});
		
		numbers.forEach(num -> productArray.add((runningTotal/num)));
		
		return productArray;
	}
	
	public static void main(String[] args) {
		System.out.println(makeProductArrayWithoutDivision(numberList));
		System.out.println(makeProductArrayWithDivision(numberList));
	}
}
