package game.chess;

/**
 * Moves a piece.
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public class Movement
{
   
    private int let1, let2 , num1, num2;
    private Board cboard;
    
    /**
     * @params Constructor to set values of values needed.
     */
    public Movement(int let1, int let2, int num1, int num2,Board cboard)
    {
        this.let1=let1;
        this.let2=let2;
        this.num1=num1;
        this.num2=num2;
        this.cboard=cboard;
    }

    /**
     * @params Generic movement. It moves a piece.
     */
    public void generic()
    {
        if(cboard.board[let2][num2] instanceof None){//If there is no piece at target, the piece can move, no problem.
			
            cboard.board[let2][num2]=cboard.board[let1][num1];//New space = piece being moved
			cboard.board[let1][num1]=new None();//Old space = nothing there
			return;
			
		}
		else if(!(cboard.board[let2][num2] instanceof None)){//If there is a piece at target,
			
			if(cboard.board[let2][num2].colour().equalsIgnoreCase(cboard.board[let1][num1].colour())){//If the piece is thy own,
				
				System.out.println("You cannot kill your own member!\n");//For obvious reasons
				Errors.nomesr();
				return;
			
			}
			else{//If the piece is not thy own,
				
				if(cboard.board[let2][num2] instanceof King){//If the piece is a King, (checkmate)
					
					cboard.board[let2][num2]=cboard.board[let1][num1];//New space = piece being moved
					cboard.board[let1][num1]=new None();//Old space = nothing there
					
					System.out.println(cboard.board[let2][num2].colour().equalsIgnoreCase("black")?"Black wins!":"White wins!");//Printing who won
					RunChess.gameState=false;//End the game
					return;
				}
				else{
					
				    System.out.println(cboard.board[let1][num1].colour()+" used "+cboard.board[let1][num1].type()+" to kill "+cboard.board[let2][num2].type()+"\n\n");//Printing who killed who
				    cboard.board[let2][num2]=cboard.board[let1][num1];//New space = piece being moved
				    cboard.board[let1][num1]=new None();//Old space = nothing there
					
					return;
					
				}
				
			}
			
		}
    }
}
