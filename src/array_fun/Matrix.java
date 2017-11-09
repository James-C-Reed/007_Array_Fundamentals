package array_fun;

public class Matrix {
	
	private int[][] ticTacToe = {
			{00,01,02},
			{10,11,12},
			{20,21,22}
	};
	
	private int[][] game = {
			{0,0,0},
			{0,1,0},
			{0,0,0}
	};
	
	private char[][] realGame = {
			{'-','-','-'},
			{'-','-','-'},
			{'-','-','-'}
	};
	
	String[][] checkers = new String[8][8];
	
	public void test2D() {
		
		checkers[0][0] = "red";
		checkers[0][7] = "red king";
		checkers[3][4] = " ";
		checkers[7][0] = "black";
		checkers[7][7] = "black king";
		
		System.out.println("\nTest of 2D array\n");
		
		for (int row = 0; row <= 2; row++) {
			for (int col = 0; col <= 2; col++) {
				System.out.println("test ticTacToe[" + row + "][" + col + "] = " + ticTacToe[row][col]);
			}
		}
		
		System.out.println("\nprint 3x3\n");
				
		for (int row = 0; row < ticTacToe.length ; row++) {
			for (int col = 0; col < ticTacToe[0].length; col++) {
				System.out.print(ticTacToe[row][col] + " ");	
			}
		System.out.println();
		}
		
	}

	public void gameboard() {
		
		System.out.println("\nprint initial gameboard\n");
		
		for (int row = 0; row < game.length ; row++) {
			for (int col = 0; col < game[0].length; col++) {
				System.out.print(game[row][col] + " ");	
			}
		System.out.println();
		}
		
		System.out.println("\now set row 0 col 0 to 1\n");
		game[0][0] = 1;
		for (int row = 0; row < game.length ; row++) {
			for (int col = 0; col < game[0].length; col++) {
				System.out.print(game[row][col] + " ");	
			}
		System.out.println();
		}
		
		System.out.println("\nfinaly set row 2 col 2 to 1\n");
		game[2][2] = 1;
		for (int row = 0; row < game.length ; row++) {
			for (int col = 0; col < game[0].length; col++) {
				System.out.print(game[row][col] + " ");	
			}
		System.out.println();
		}
		
		
		System.out.println("\nfinal test\n");
		realGame[0][1] = 'X';
		realGame[1][1] = 'X';
		realGame[2][2] = '0';
		for (int row = 0; row < realGame.length ; row++) {
			for (int col = 0; col < realGame[0].length; col++) {
				System.out.print(realGame[row][col] + " ");	
			}
		System.out.println();
		}
		
		
		
	}
	
	
}
