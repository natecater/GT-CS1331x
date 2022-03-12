import java.util.Scanner;

public class Battleship {

	public static void main(String[] args){
	
		System.out.println("Welcome to Battleship!);
		
		Scanner input = new Scanner(System.in);
		
		
		
		//checking something
	}
	
	// method provided for assignment to print the battleship map
	
	private static void printBattleship(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}
	
}