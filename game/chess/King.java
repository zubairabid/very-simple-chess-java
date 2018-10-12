package game.chess;

/**
 * The King class.
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public class King extends Pieces{

	private String colour,ty;
	
	public King(String col){
		colour=col;
		ty=(colour.equalsIgnoreCase("black")?"Bk":"Wk");
	}
	
	
	public String colour() {
		
		return colour;
	}

	
	public void movement(int let1,int let2,int num1,int num2,int mv1,int mv2,int m,int v,Board cboard) {
		
		
		
		Errors.isMove(mv1, mv2);//Checks if piece is moving or not
		
		if(!((m==1 && v==0) || (v==1 && m==0)||(m==1 && v==1))){//If the movement is not only 1 step( in any direction).
			
			Errors.retry();
			return;
		}
		
		Movement am = new Movement(let1,let2,num1,num2, cboard);
		am.generic();
		
	}

	public String type() {
		
		return ty;
	}

	
	
}
