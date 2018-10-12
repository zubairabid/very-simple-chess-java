package game.chess;

/**
 * This prints the Board.
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public class Tests {

	/**
	 * Prints the Board
	 * @param cboard:an instance of Board
	 */
	public static void print(Board cboard){
		for(int i=0;i<=7;i++){
			System.out.print((char)(i+65)+":");//Printing the 'A', 'B', etc at the beginning of each line.
			
			for(int j=0;j<=7;j++){//Prints each row.
								
					System.out.print(cboard.board[i][j].type());
				
			}
			System.out.println();//Change line
		}
		for(int i=0;i<=8;i++){//Prints the column number.
			if(i>0)
				System.out.print(i+" ");
			else
				System.out.print("  ");
		}
		System.out.println();
		
	}
	
}
