package game.chess;

/**
 * The Pawn class.
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public class Pawn extends Pieces{
    
    private String colour,ty;
    /**
     * Gives number of moves the pawn has done
     */
    public int nom=0;
    public Pawn(String col){
        colour=col;
        ty=(colour.equalsIgnoreCase("black")?"Bp":"Wp");
    }

    public String colour() {
        
        return colour;
    }

    public void movement(int let1,int let2,int num1,int num2,int mv1,int mv2,int m,int v,Board cboard) {
        
        
        Errors.isMove(mv1, mv2);
        
        if(m>1||v>1)//If movement greater than one
        {
            Errors.retry();
            return;
        }
        else
        {
            if(m==1&&v==1)//If both are one, i.e, if movement is diagonal
            {
                if(cboard.board[let2][num2] instanceof None)//If there is nothing there,
                {
                    Errors.retry();//Illegal
                    return;
                }
                else if(!(cboard.board[let2][num2] instanceof None))//If there IS a piece,
                {
                    
                }
            }
            else if(m==1 && v==0)//legal(one step forward)
            {
                
            }
            else if(m==2 && v==0)
            {
            	if(cboard.board[let1][num1].colour().equalsIgnoreCase("black"))
            		if(let1==1)
            			;
            		else
            			{Errors.retry();return;}
            	if(cboard.board[let1][num1].colour().equalsIgnoreCase("white"))
            		if(let1==6)
            			;
            		else
            			{Errors.retry();return;}
            }
            else//Rest?illegal
            {
                Errors.retry();
                return;
            }
        }
        
        //This ensures that pawn cannot go back
        if(cboard.board[let1][num1].colour().equalsIgnoreCase("black"))
        {
            if(mv1<0)
            {
                Errors.retry();
                return;
            }
        }
        else if(cboard.board[let1][num1].colour().equalsIgnoreCase("white"))
        {
            if(mv1>0)
            {
                Errors.retry();
                return;
            }
        }
        cboard.board[let1][num1].nom++;
        System.out.println(nom);
        Movement am = new Movement(let1,let2,num1,num2, cboard);
        am.generic();
        
    }
    public String type() {
        
        return ty;
    }
    
}
