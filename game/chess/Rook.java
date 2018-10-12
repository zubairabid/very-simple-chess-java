package game.chess;

/**
 * The Rook class.
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public class Rook extends Pieces{
    
    private String colour,ty;
    
    public Rook(String col){
        colour=col;
        ty=(colour.equalsIgnoreCase("black")?"Br":"Wr");
    }

    public String colour() {
        
        return colour;
    }

    public void movement(int let1,int let2,int num1,int num2,int mv1,int mv2,int m,int v,Board cboard) {
        
        
        
        Errors.isMove(mv1, mv2  );//Checks if piece is moving or not
        
        //To ensure that rook moves only column or row wise
        if(m>0 && v>0)
        {
            Errors.retry();
            return;
        }
        
        if(m==0)//If column- wise movement,
        {
            if(!Check.m0(v, mv2, let1, num1, cboard))//If there is a piece between start and target,
            {
                return;
            }
        }
        
        if(v==0)//If row- wise movement.
        {
            if(!Check.v0(m, mv1, let1, num1, cboard))//If there is a piece between start and target,
            {
                return;
            }
        }
        
        Movement am = new Movement(let1,let2,num1,num2, cboard);
        am.generic();
        
    }
    public String type() {
        
        return ty;
    }
    
}
