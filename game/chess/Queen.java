package game.chess;

/**
 * The Queen class.
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public class Queen extends Pieces{

	private String colour,ty;
	
	public Queen(String col){
		colour=col;
		ty=(colour.equalsIgnoreCase("black")?"Bq":"Wq");
	}
	
	
	public String colour() {
		
		return colour;
	}

	public void movement(int let1,int let2,int num1,int num2,int mv1,int mv2,int m,int v,Board cboard) {
		
		
		Errors.isMove(mv1, mv2);//Checks if piece is moving or not
		
		if(m==v)//If diagonal movement
		{
		    if(!Check.mv(m, v, mv1, mv2, let1, num1, cboard))//If there is a piece in between start and target,
            {
                return;
            }
		}
		else if(m==0)//If column wise movement,
		{
		    if(!Check.m0(v, mv2, let1, num1, cboard))//If there is a piece in between start and target,
            {
                return;
            }
		}
		else if(v==0)//If row- wise movement,
		{
		    if(!Check.v0(m, mv1, let1, num1, cboard))//If there is a piece in between start and target,
            {
                return;
            }
		}
		else//Else will be a error
		{
		    Errors.retry();
		    return;
		}
		Movement am = new Movement(let1,let2,num1,num2, cboard);
		am.generic();
		
	}
	public  String type() {
		return ty;
	}

}
