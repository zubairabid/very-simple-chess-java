package game.chess;

/**
 * The Knight class.
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public class Knight extends Pieces{
	
	private String colour,ty;
	
	public Knight(String col){
		colour=col;
		ty=(colour.equalsIgnoreCase("black")?"Bn":"Wn");
	}
	
	public String colour() {
		
		return colour;
	}

	public void movement(int let1,int let2,int num1,int num2,int mv1,int mv2,int m,int v,Board cboard) {
		
		
		
		Errors.isMove(mv1, mv2);
		
		if(!((m==2 && v==1)|| m==1&& v==2))//If movement not legal,
		{
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
