package game.chess;

/**
 * This is a class which does not do much. It contains 2 members: one, a boolean, to check if the game is running 
 * is running or over, and two, the main function, which passes control to the MakeCharPlay.formailities()
 * method
 * 
 * @author Zubair Abid 
 * @version 0.1
 */

public class RunChess{

    /**
     * Checks if the game is still running or not. If 'true', it is running.
     */
	static boolean gameState=true;
	
	public static void main(String[] args) {
	    //Calls the formalities function which ...
		Board cboard=new Board();
		MakeCharPlay.formalities(cboard);
	}

}
