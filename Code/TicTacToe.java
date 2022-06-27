package TicTac;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		System.out.println("This is a Tic-Tac-Toe game.");
		System.out.println("***************************");
		Scanner UserInput = new Scanner(System.in);
		TicTacGame Mul = new TicTacGame();
	
			System.out.println("The table below indicates how each cell is labelled");
		    System.out.println("   0 1 2");
			System.out.println("A  " + " | | ");
			System.out.println("   ------");
			System.out.println("B  " + " | | ");
			System.out.println("   ------");
			System.out.println("C  " + " | | ");
			
			Mul.main(args);

	}

}
