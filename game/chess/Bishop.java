package game.chess;

/**
 * The Bishop class.
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public class Bishop extends Pieces{

	private String colour,ty;
	
	public Bishop(String col){
		colour=col;
		ty=(colour.equalsIgnoreCase("black")?"Bb":"Wb");
	}
	public String type() {
		
		return ty;
	}
	
	public String colour() {
		
		return colour;
	}

	public void movement(int let1,int let2,int num1,int num2,int mv1,int mv2,int m,int v,Board cboard)
	{
		Errors.isMove(mv1, mv2);
		
		if(m!=v)//If the movement is not diagonal,
		{
			
			Errors.retry();//Illegal
			return;
		}
		else if(m==v)//If movement is diagonal,
		{
		    if(!Check.mv(m, v, mv1, mv2, let1, num1, cboard))//If there is a piece between start and target,
            {
                return;
            }
		}
		
		
		Movement am = new Movement(let1,let2,num1,num2, cboard);
		am.generic();
		
	}

	
	
	
}
