package bryce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * 
 * @author Bryce Dillman <{@literal dillman19199@gmail.com}
 *
 * the goal is to determine the largest square submatrix that
 * contains all 1's.  A Square submatrix is one of equal width
 * and height, and it will return the area of the largest
 * submatrix that contains only 1's.
 *
 */
public class MaximalSquare {
	private static String[] strArray = {"10100", "10111", "11111", "10010"};
	private static String[][] matrix;
	private static int counter;
	private static int x;
	private static int y;
	
	
	/*
	 * since every entry in the strArray must be the same 
	 * length to build a matrix, i am assuming the length
	 * of one is the length of all.
	 */
	public static String[][] buildMatrix(final String[] strArray) {
		matrix = new String[strArray.length][strArray[0].length()];
		counter = 0;
		
		for (String str : strArray) {
			x = counter;
			matrix[x] =str.split("");
			counter++;
		}

		return matrix;
	}
	
	public static int findSubmatrix(final String[][] matrix) {
		return 1;
	}
	
	public static void main(String[] args) {
		buildMatrix(strArray);
	}
}
