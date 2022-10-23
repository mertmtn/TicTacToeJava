
public class TicTacToeTest {

	public static void main(String[] args) {
		TicTacToe game= new TicTacToe();
		char checker1= 'x';
		char checker2= 'o';
		
		game.displayBoard();
		boolean checkForWins= false;
		boolean isFull=false;
		
		while (!isFull && !checkForWins) {
			game.promptUser(checker1);
			game.displayBoard();
			checkForWins=game.checkForWins();
			
			if (checkForWins) {
				System.out.printf("User %c wins!",checker1);
				break;
			}
			
			isFull=game.isFull();
			if (isFull) {
				System.out.printf("Board is full, nobody wins!");
				break;
			}
			
			
			game.promptUser(checker2);
			game.displayBoard();
			checkForWins=game.checkForWins();
			
			if (checkForWins) {
				System.out.printf("User %c wins!",checker2);
				break;
			}
			
			isFull=game.isFull();
			if (isFull) {
				System.out.printf("Board is full, nobody wins!");
				break;
			}
		}
	}
}
