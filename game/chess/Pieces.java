package game.chess;

/**
 * Write a description of class Castle here.
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public abstract class Pieces {

    /**
     * Returns the colour of the piece
     */
	abstract protected String colour();
	
	/**
     * Checks if the movement of the piece is legal
     * @param 
     */
	abstract protected void movement(int let1,int let2,int num1,int num2,int mv1,int mv2,int m,int v,Board cboard);
	
	/**
     * Returns the name the piece to be printed
     */
	abstract protected String type();
	/**
	 * Number of moves
	 */
	protected int nom;
}
