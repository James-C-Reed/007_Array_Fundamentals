package array_fun;

public class Matrix {
	
	private int[][] ticTacToe= new int [3][3];
	{
	ticTacToe[0][0] = 0;
	ticTacToe[0][1] = 1;
	ticTacToe[0][2] = 2;
	
	ticTacToe[1][0] = 10;
	ticTacToe[1][1] = 11;
	ticTacToe[1][2] = 12;
	
	ticTacToe[2][0] = 20;
	ticTacToe[2][1] = 21;
	ticTacToe[2][2] = 22;
	
};

	for (int r = 0; r < ticTacToe.length; r++) {
	
		System.out.println("row = " + r);
		
	}
	
public void build_2D_array() {
	
	System.out.println("...building a 2D array, meaning rows and collums");
	
}

}
