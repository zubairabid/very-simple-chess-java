package game.chess;

/**
 * Checks if there is a Piece from where we told a piece to move
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public class MoveAndPlace {

    /**
     * Checks if there is a Piece from where we told a piece to move
     */
    static void theWork(String from, String to, String colour, Board cboard){
        //Extracts the characters from the co- ordinates
        String toLet1=from.substring(0, 1);
        String toNum1=from.substring(1, 2);
        
        String toLet2=to.substring(0, 1);
        String toNum2=to.substring(1, 2);
        
        //Converts the first character of the co- ordinate to an index for the board array
        int let1=toLet1.equalsIgnoreCase("a")?0:toLet1.equalsIgnoreCase("b")?1:toLet1.equalsIgnoreCase("c")?2:toLet1.equalsIgnoreCase("d")?3:toLet1.equalsIgnoreCase("e")?4:toLet1.equalsIgnoreCase("f")?5:toLet1.equalsIgnoreCase("g")?6:7;
        int num1=(Integer.parseInt(toNum1))-1;//Converts the second character of the co- ordinate to an index for the board array
        //Converts the first character of the co- ordinate to an index for the board array
        int let2=toLet2.equalsIgnoreCase("a")?0:toLet2.equalsIgnoreCase("b")?1:toLet2.equalsIgnoreCase("c")?2:toLet2.equalsIgnoreCase("d")?3:toLet2.equalsIgnoreCase("e")?4:toLet2.equalsIgnoreCase("f")?5:toLet2.equalsIgnoreCase("g")?6:7;
        int num2=(Integer.parseInt(toNum2))-1;//Converts the second character of the co- ordinate to an index for the board array
        
        int mv1=let2-let1;//The number to be added to the first ordinate of the board array, i.e., to increase row value
        int mv2=num2-num1;//The number to be added to the second ordinate of the board array, i.e., to increase column value
        //Absolute values of mv1 and mv2, for lighter coding
        int m = Math.abs(mv1);
        int v= Math.abs(mv2);
        
        
        if(cboard.board[let1][num1] instanceof None)
        {//If the 'from' square is empty, 
            System.out.println("Wrong co- ordinates.");
            Errors.nomesr();
            return;
        }
        else if(!(colour.equalsIgnoreCase(cboard.board[let1][num1].colour())))
        {
            System.out.println("You cannot move opponent's pieces");
            Errors.nomesr();
            return;
        }
        else
        {
            cboard.board[let1][num1].movement(let1,let2,num1,num2,mv1,mv2,m,v,cboard);
        }
    }
    
}
