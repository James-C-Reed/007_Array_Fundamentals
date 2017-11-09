package array_fun;

public class TicTacToe {
	
	private char[][] realGame = {
			{'-','-','-'},
			{'-','-','-'},
			{'-','-','-'}
	};
	
	public void tictactoe() {
		
		System.out.println("Hello, fellow tic-tac-toe lover!");
		
		System.out.println("\nfinal test\n");
		for (int row = 0; row < realGame.length ; row++) {
			for (int col = 0; col < realGame[0].length; col++) {
				System.out.print(realGame[row][col] + " ");	
			}
		System.out.println();
		}
		
	}

}
