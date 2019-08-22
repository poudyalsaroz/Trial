package cpp_1;

public class GameEngine {
	
	private boolean currentPlayer = true;;
	
	private Board board;
	
	public boolean getCurrentPlayer() {
		
		return currentPlayer;
	
	}
	
	public void changePlayer() {
		if(currentPlayer) {
			currentPlayer = false;
		}
		else
			currentPlayer = true;
	}
	
	public void startGame() {
		board = new Board();
		board.printBoard();
	}
	
	public void printBoard() {
		board.printBoard();
	}
	
	public void setMark(int a, int b) {
		board.setMark(a, b, currentPlayer);
	}

	public boolean getStatus(int a, int b) {
		if(board.getStatus(a, b)) 
			return true;
		else
			return false;
	}

	public boolean checkWinner() {
		return board.checkWinner();
	}

	public boolean getGameOver() {
		return board.getGameOver();
	}
	
	
	
	

}
