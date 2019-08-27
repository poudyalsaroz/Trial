package cpp_1;

public class Board {

	private Square [][] room = new Square[3][3];
	
	public Board() {
		createBoard();
	}
	
	public void createBoard() {
		for( int i = 0 ; i< 3; i++) {
			for( int j = 0; j < 3; j++) {
				room[i][j] = new Square();
			}
		}
	}
	
	//printBoard method prints the board.
	public void printBoard() {
			for( int i = 0; i < 3; i++ ) {
				for( int j = 0; j < 3; j++ ) {
					System.out.print(room[i][j].getMark());
				}
				System.out.println();
			}
	}
	
	public boolean getStatus(int a, int b) {
		if(room[a][b].getEmpty())
			return true;
		else
			return false;
	}
	
	public void setMark(int a , int b, boolean player) {
		if(player)
			room[a][b].setMark("# ");
		else
			room[a][b].setMark("X ");
	}
	
	public boolean checkWinner() {
		boolean stat = false;
		
		for(int i = 0; i< 3; i++){
			
			if( room[i][0].getMark()!= "[]") {
				
				if(room[i][0].getMark() == room[i][1].getMark() && room[i][1].getMark() == room[i][2].getMark())//checking row
					stat = true;
			}
			if( room[0][i].getMark()!= "[]") {
				if(room[0][i].getMark() == room[1][i].getMark() && room[1][i].getMark() == room[2][i].getMark())//checking column
					stat = true;
			}
			if( room[1][1].getMark()!= "[]") {
				if(room[0][0].getMark() == room[1][1].getMark() && room[1][1].getMark() == room[2][2].getMark()//checking diagonal
					||room[0][2].getMark() == room[1][1].getMark() && room[1][1].getMark() == room[2][0].getMark())//checking diagonal
					stat = true;
			}
		}
	
		return stat;	
	}

	public boolean getGameOver() {
		boolean gameOver = true;
		for(int i = 0; i< 3;i++) {
			for(int j = 0; j< 3;j++) {
				if(room[i][j].getEmpty()) 
					gameOver = false;	
			}
		}
		return gameOver;
	}
	
}
