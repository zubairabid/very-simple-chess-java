package game.chess;

/**
 * Has the Board. The game makes changes to it.
 * 
 * @author Zubair Abid
 * @version 0.1
 */

public class Board {

    private static String b="black",w="white";
    //Objects of the pieces.
    static King Bk=new King(b),Wk=new King(w);
    static Queen Bq=new Queen(b),Wq=new Queen(w);
    static Knight Bn=new Knight(b),Wn=new Knight(w);
    static Bishop Bb=new Bishop(b),Wb=new Bishop(w);
    static Rook Br=new Rook(b),Wr=new Rook(w);
    static Pawn Bp=new Pawn(b),Wp=new Pawn(w);
    static None n=new None();
    /**
     * Array containing the board.
     */
    Pieces[][] board={{Br,Bn,Bb,Bq,Bk,Bb,Bn,Br},
                             {Bp,Bp,Bp,Bp,Bp,Bp,Bp,Bp},
                             {n,n,n,n,n,n,n,n},
                             {n,n,n,n,n,n,n,n},
                             {n,n,n,n,n,n,n,n},
                             {n,n,n,n,n,n,n,n},
                             {Wp,Wp,Wp,Wp,Wp,Wp,Wp,Wp},
                             {Wr,Wn,Wb,Wq,Wk,Wb,Wn,Wr}};
    
}
