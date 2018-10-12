package game.chess;

/**
 * MakeCharPlay asks for the player's names, has the game loop.
 * 
 * @author Zubair Abid
 * @version 0.1
 */


import java.util.Scanner;

public class MakeCharPlay {

    static String bp,wp;
    /**
     * This boolean tells who is playing- if false, white, else, black.(in the beginning of the game function)
     */
    static boolean kel=true;
    
    /**
     * Asks for the player's names and then passes the name to the 'game' function which ...
     */
    static void formalities(Board cboard){
        
        Scanner sc=new Scanner (System.in);
        System.out.println("\fEnter name of player playing with black pieces:\n");
        bp=sc.nextLine();
        System.out.println("\n\nEnter name of player playing with white pieces:\n");
        wp=sc.nextLine();
        
        game(bp,wp,cboard);
    }
    
    /**
     * Has the game loop.
     */
    static void game(String bp,String wp,Board cboard){
        
        
        Scanner sc=new Scanner(System.in);
        
        while(RunChess.gameState){//ie, while the game is running,
            //Prints whose chance it is
            System.out.println("Enter \'exit\' without quotes to exit the game, \'restart\' to restart the game, and \'Castle\' to castle");
            System.out.println((!kel?bp:wp)+"\'s chance:\n");
            kel=!kel;//Changing control.
            //Prints the board.
            Tests.print(cboard);
            System.out.println("Move from:");
            String from=sc.nextLine();//co-ordinates of the piece
            if(from.equalsIgnoreCase("exit"))//In case we entered "exit"
                System.exit(0);//exit
            if(from.equalsIgnoreCase("restart"))//In case we entered "restart"
                formalities(new Board());//Restart WITH A NEW BOARD
            if(from.equalsIgnoreCase("castle"))//If we entered "castle"
            {
            	//Castle!
                Castle c = new Castle(!kel?"White":"Black",cboard);//Since the value of kel has changed, no 
                game(bp,wp,cboard);
            }    
            System.out.println("Move to:");
            String to=sc.nextLine();//co-ordinates of where the piece will go
            if(to.equalsIgnoreCase("exit"))//In case we entered "exit"
                System.exit(0);//exit
            if(to.equalsIgnoreCase("restart"))//In case we entered "restart"
                formalities(new Board());//Restart WITH A NEW BOARD
            if(to.equalsIgnoreCase("castle"))//If we entered "castle"
            {
            	//Castle!
                Castle c = new Castle(!kel?"White":"Black",cboard);
                game(bp,wp,cboard);
            } 
            if(RunChess.gameState==false)
            	break;
            //Passes control to MoveAndPlace.theWork(String from, String to)
            MoveAndPlace.theWork(from, to,(kel?"black":"white"),cboard);
        }
    }
    
}
