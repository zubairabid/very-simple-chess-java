package game.chess;

/**
 * This checks if a piece is illegally jumping over some other piece.
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public class Check
{
    
    /**
     * When m=0(i.e, When movement is columnwise).
     */
    public static boolean m0(int v, int mv2,int let1, int num1,Board cboard)
    {
        for(int x=1;x<v;x++)//Cycles through all the squares between start and target
        {
            if(mv2>0)//If movement in the column is positive,
            {
                if(!(cboard.board[let1][num1+x] instanceof None))//If square in focus has a piece in it, 
                {
                    Errors.retry();
                    return false;
                }
            }
            else if(mv2<0)//If movement in the column is negative,
            {
                if(!(cboard.board[let1][num1-x] instanceof None))//If square in focus has a piece in it, 
                {
                    Errors.retry();
                    return false;
                }
            }
            else
            {
                System.out.println("\nAn error occured. Please contact your service distributor, and try some other move for now.\n\n");
                Errors.nomesr();
                return false;
            }
        }
        
        
        return true;
    }
    
    /**
     * @params When v=0(i.e, When movement is rowwise).
     */
    public static boolean v0(int m, int mv1,int let1, int num1,Board cboard)
    {
        for(int x=1;x<m;x++)//Cycles through all the squares between start and target
        {
            if(mv1>0)//If movement in the row is positive,
            {
                if(!(cboard.board[let1+x][num1] instanceof None))//If square in focus has a piece in it, 
                {
                    Errors.retry();
                    return false;
                }
            }
            else if(mv1<0)//If movement in the row is negative,
            {
                if(!(cboard.board[let1-x][num1] instanceof None))//If square in focus has a piece in it, 
                {
                    Errors.retry();
                    return false;
                }
            }
            else
            {
                System.out.println("\nAn error occured. Please contact your service distributor, and try some other move for now.\n\n");
                Errors.nomesr();
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * @params When none are zero(i.e, When movement is columnwise).
     */
    public static boolean mv(int m,int v, int mv1,int mv2,int let1, int num1,Board cboard)
    {
        for(int x=1,y=1;x<m && y<=v;x++,y++)//Cycles through all the squares between start and target
        {
            if(mv1>0 && mv2 >0)//If row and column movements are positive,
            {
                if(!(cboard.board[let1+x][num1+y] instanceof None))//If square in focus has a piece in it, 
                {
                    Errors.retry();
                    return false;
                }
            }
            else if(mv1>0 && mv2 <0)//If row movement is positive and column movement is negative.
            {
                if(!(cboard.board[let1+x][num1-y] instanceof None))//If square in focus has a piece in it, 
                {
                    Errors.retry();
                    return false;
                }
            }
            else if(mv1<0 && mv2 >0)//If column movement is positive and row movement is negative,
            {
                if(!(cboard.board[let1-x][num1+y] instanceof None))//If square in focus has a piece in it, 
                {
                    Errors.retry();
                    return false;
                }
            }
            else if(mv1<0 && mv2 <0)//If row and column movements are positive,
            {
                if(!(cboard.board[let1-x][num1-y] instanceof None))//If square in focus has a piece in it, 
                {
                    Errors.retry();
                    return false;
                }
            }
            else
            {
                System.out.println("\nAn error occured. Please contact your service distributor, and try some other move for now.\n\n");
                Errors.nomesr();
                return false;
            }
            
        }
        
        return true;
    }
}
