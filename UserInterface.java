package cpp_1;

import java.util.Scanner;

public class UserInterface {
	
	public boolean done = true;
	private GameEngine game;
	
	Scanner scan  = new Scanner(System.in);
	
	public void start() {
		game = new GameEngine();
		game.startGame();
	
		while(done) {
			
			if(!(game.getGameOver())) {
		
			if(game.getCurrentPlayer())
				System.out.println("Player 1's turn: ");
			else
				System.out.println("Player 2's turn: ");
	
			System.out.println("Enter row #: ");
				int a = scan.nextInt();
	
			System.out.println("Enter Column #: ");
				int b = scan.nextInt();
			
				if(game.getStatus(a,b)) {				
					game.setMark(a, b);
				
					if(game.checkWinner()) {
						done = false;
						game.printBoard();
						System.out.println("Congratulation!! You won.");
						System.exit(0);
					}
					game.printBoard();
					game.changePlayer();
				}
				else
					System.out.println("Row # and column # is taken.");
			}
			else {
				System.out.println("No winner in this game!");
				done = false;
			}
		}
	}
}
