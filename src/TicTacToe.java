import java.util.Iterator;
import java.util.Scanner;

public class TicTacToe {
	char [][] board;
	
	public TicTacToe() {
		board = new char [3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j]='-';
			}
		}
	}
	
	public void displayBoard() {		
		System.out.println("-------");
		for (int a = 0; a < 3; a++) {
			System.out.print("|");
			for (int b = 0; b < 3; b++) {
				System.out.printf("%c",board[a][b]);
				System.out.print("|");
			}
			System.out.println("\n-------");
		}		
	}
	
	public void promptUser(char checker) {
		int row,col;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.printf("Player %c: Please enter a row number(1,2,3)>",checker);
			row=input.nextInt();
			 while (row<1 || row>3) {
				 System.out.println("The row number hast o be 1,2,3");	
				 System.out.printf("Player %c: Please enter a row number again(1,2,3)>",checker);
				row=input.nextInt();
			 }
			 System.out.printf("Player %c: Please enter a column number(1,2,3)>",checker);
				col=input.nextInt();
				 while (col<1 || col>3) {
					 System.out.println("The column number hast o be 1,2,3");	
					 System.out.printf("Player %c: Please enter a column number again(1,2,3)>",checker);
					 col=input.nextInt();
				 }
		}while (!(isEmpty(row,col)));
		board[row-1][col-1]=checker;
	}

	public boolean isEmpty(int row, int col) {		
		return board[row-1][col-1] == '-';
	}
	
	public boolean checkForWins() {		
		 
		for (int row=0; row<3; row++) {
			if(board[row][0] !='-' &&board[row][1]==board[row][0]&& board[row][0]==board[row][2])
				return true;
		}
		
		for (int col=0; col<3; col++) {
			if(board[0][col] !='-' &&board[0][col]==board[1][col]&& board[0][col]==board[2][col])
				return true;			
		}
		
		if(board[0][0] !='-' &&board[0][0]==board[1][1]&& board[0][0]==board[2][2])
			return true;	
		
		if(board[0][2] !='-' &&board[0][2]==board[1][1]&& board[2][0]==board[1][1])
			return true;	
		
		return false;
	}
	
	public boolean isFull() {
		for (int a = 0; a < 3; a++) { 
			for (int b = 0; b < 3; b++) {
				if (board[a][b]=='-') {
					return false;
				}	
			}
		}
		return true;
	}
}
