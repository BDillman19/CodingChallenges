package bryce;
/**
 * 
 * 
 * @author Bryce Dillman <{@literal dillman19199@gmail.com}
 * 
 * This class is an example of the eight queens programming problem.
 * It will determine if all of the queens are places is such a way where
 * none of them are attacking each other.  If that is true, then it will
 * return true.  Otherwise return the first queen in the list that is
 * attacking another piece in the same format it was provided.
 *
 */
public class EightQueens {
	private static String[] safeQueens = {"(2,1)", "(4,2)", "(6,3)", "(8,4)", "(3,5)", "(1,6)", "(7,7)", "(5,8)"};
	private static String[] attackingQueens = {"(2,1)", "(4,3)", "(6,3)", "(8,4)", "(3,5)", "(1,6)", "(7,7)", "(5,8)"};
	
	public static String eightQueens(String[] strArr) {
		int[][] board = new int[8][8];
		
		for (String coords : strArr) {
			String[] xy = coords.replaceAll("[^0-9,]", "").split(",");
			board[Integer.parseInt(xy[1]) -1][Integer.parseInt(xy[0]) -1] = 1;
		}
		
		for (String coords : strArr) {
			String[] xy = coords.replaceAll("[^0-9,]", "").split(",");
			int x = Integer.parseInt(xy[0]) -1;
			int y = Integer.parseInt(xy[1]) -1;
			for (int i = 0; i < 8; i++) {
				if (i != x && board[y][i] == 1) {
					return coords;
				}
				if (i != y && board[i][x] == 1) {
					return coords;
				}
				if (i != 0 && x + i < 8 && y + 1 < 8 && board[y+i][x+i] == 1) {
					return coords;
				}
				if (i != 0 && x + i < 8 && y - 1 >= 0 && board[y+i][x+i] == 1) {
					return coords;
				}
				if (i != 0 && x - i >= 0 && y + 1 < 8 && board[y+i][x+i] == 1) {
					return coords;
				}
				if (i != 0 && x - i >= 0 && y - i >= 0 && board[y+i][x+i] == 1) {
					return coords;
				}
			}
		}
		return "true";
	}
	
	public static void main(String[] args) {
		System.out.println(eightQueens(safeQueens));		
		System.out.println(eightQueens(attackingQueens));
	}
}