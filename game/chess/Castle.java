package game.chess;
import java.util.Scanner;
/**
 * Class Castle is the class that enables castling to happen.
 * 
 * @author Zubair Abid
 * @version 0.1
 */
public class Castle
{
	private Board cboard;
    private static String colour;
    /**
     * @params Sets colour and passes to 'work' function.
     */
    public Castle(String colour,Board cboard)
    {
    	this.cboard=cboard;
        this.colour= colour;
        work();
    }
    
    /**
     * @params Passes number of row to other 'work' function. 
     */
    private void work()
    {
        if(colour.equalsIgnoreCase("Black"))
            work(0);
        else
            work(7);
    }
    
    /**
     * @params Does the castling work.
     */
    private void work(int row)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Do you want to castle with "+(row==0?"A":"H")+"1 or "+ (row==0?"A":"H")+"8");
        String choice = sc.nextLine();
        
        char c0= choice.charAt(0), c1 = choice.charAt(1);
        
        
        int let = row;//Sets let equal to row
        int num = (c1=='8'?7:0);
        
        boolean k = (num==0?true:false);
        
        if(!(cboard.board[let][num] instanceof Rook && cboard.board[let][num].colour().equalsIgnoreCase(colour)))//If the piece is not a rook of the right colour,
        {
            Errors.retry();
            return;
        }
        
        if(k)//If the rook to castle with is the closer one, 
        {
            if(!(cboard.board[let][1] instanceof None && cboard.board[let][2] instanceof None && cboard.board[let][3] instanceof None))//No pieces in gap
            {
                Errors.retry();
                return;
            }
            else//Move Pieces
            {
                cboard.board[let][2]=cboard.board[let][0];
                cboard.board[let][1]=cboard.board[let][4];
                cboard.board[let][0]=new None();
                cboard.board[let][4]=new None();
            }
        }
        else if(!k)//If the rook to castle with is the further one,
        {
            if(!(cboard.board[let][5]instanceof None && cboard.board[let][6] instanceof None))//No pieces in gap
            {
                Errors.retry();
                return;
            }
            else//Move pieces
            {
                cboard.board[let][6]=cboard.board[let][4];
                cboard.board[let][5]=cboard.board[let][7];
                cboard.board[let][4]=new None();
                cboard.board[let][7]=new None();
            }
        }
    }
}
