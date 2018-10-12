package game.chess;

/**
 * Set of default errors.
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public class Errors
{
    /**
     * @params Prints an illegal message and changes the control back to player who started move.
     */
    public static void retry()
    {
        System.out.println("Illegal!!! Please try again.\n\n");
        MakeCharPlay.kel=!MakeCharPlay.kel;
    }
    
    
    /**
     * @params Passes control back to player who started move.
     */
    public static void nomesr()
    {
    	 MakeCharPlay.kel=!MakeCharPlay.kel;
    }
    
    /**
     * @params Checks if piece is moving or not.
     */
    public static void isMove(int mv1, int mv2)
    {
        if(mv1==0 && mv2==0){
			System.out.println("You have to move!\n\n");
			Errors.nomesr();
			return;
		}
    }
}
