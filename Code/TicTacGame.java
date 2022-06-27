package TicTac;
import java.util.Scanner;

public class TicTacGame {
	public static void main(String[] args) {
	Scanner UserInput = new Scanner(System.in);
	String[][] TTTtable = new String[3][3];
	 TTTtable[0][0] = " ";
	 TTTtable[0][1] = " ";
	 TTTtable[0][2] = " ";
	
	 TTTtable[1][0] = " ";
	 TTTtable[1][1] = " ";
	 TTTtable[1][2] = " ";
	
	 TTTtable[2][0] = " ";
	 TTTtable[2][1] = " ";
	 TTTtable[2][2] = " ";
	 
	 TicTacGame Mul = new TicTacGame();
	
	do{
		 System.out.println("Enter cell name");
			System.out.println("***************");
			System.out.println(" ");
		System.out.println(TTTtable[0][0] +"|" + TTTtable[0][1] + "|" + TTTtable[0][2]);
		System.out.println("------");
		System.out.println(TTTtable[1][0] +"|" + TTTtable[1][1] + "|" + TTTtable[1][2]);
		System.out.println("------");
		System.out.println(TTTtable[2][0] +"|" + TTTtable[2][1] + "|" + TTTtable[2][2]);
		System.out.println(" ");
		
		String block= UserInput.next().toUpperCase();
		
		if(block.equals("A0")) {
			System.out.println("Enter play: ");
			String play = UserInput.next().toUpperCase();
			TTTtable[0][0] = play;
			
		}else if(block.equals("A1")) {
			System.out.println("Enter play: ");
			String play = UserInput.next().toUpperCase();
			TTTtable[0][1] = play;
			
		}else if(block.equals("A2")) {
			System.out.println("Enter play: ");
			String play = UserInput.next().toUpperCase();
			TTTtable[0][2] = play;
			
		}else if(block.equals("B0")) {
			System.out.println("Enter play: ");
			String play = UserInput.next().toUpperCase();
			TTTtable[1][0] = play;
			
		}else if(block.equals("B1")) {
			System.out.println("Enter play: ");
			String play = UserInput.next().toUpperCase();
			TTTtable[1][1] = play;
			
		}else if(block.equals("B2")) {
			System.out.println("Enter play: ");
			String play = UserInput.next().toUpperCase();
			TTTtable[1][2] = play;
			
		}else if(block.equals("C0")) {
			System.out.println("Enter play: ");
			String play = UserInput.next().toUpperCase();
			TTTtable[2][0] = play;
			
		}else if(block.equals("C1")) {
			System.out.println("Enter play: ");
			String play = UserInput.next().toUpperCase();
			TTTtable[2][1] = play;
			
		}else if(block.equals("C2")) {
			System.out.println("Enter play: ");
			String play = UserInput.next().toUpperCase();
			TTTtable[2][2] = play;

		}else {
			System.out.println("Invalid entry. Try again");
		Mul.main(args);
		}
		
		
	}while(TTTtable[0][0].equals(" ") || TTTtable[0][1].equals(" ") || TTTtable[0][2].equals(" ")
			|| TTTtable[1][0].equals(" ") || TTTtable[1][1].equals(" ") || TTTtable[1][2].equals(" ")
			|| TTTtable[2][0].equals(" ") || TTTtable[2][1].equals(" ") || TTTtable[2][2].equals(" "));
	
	System.out.println("Game Over...");
	System.out.println("Try again Y/N?");
	String TryAgain = UserInput.next().toLowerCase();
	
	switch (TryAgain){
	case "y":
		Mul.main(args);
		break;
	case "n":
		System.out.println("Thanks for playing :)");
	}

   }
	
}
