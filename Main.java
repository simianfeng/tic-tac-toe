
/**
 * this is the testharness class for the tic tac toe game, this 
 * game needs two players to play, whoever gets three pieces in
 * a row vertically, horizontally or diagonally, it will ask the
 * two players for their names, and then the game will start.
 * @Simon Feng
 * @2020.12.12
 * time: 2:01
 */
import java.util.*;
public class Main
{
   public static void main(String[] args){
       Scanner myScanner = new Scanner(System.in);//import the scanner
       Player p1 = new Player();//create the first player object
       Player p2 = new Player();//create the second player object
       System.out.print("First player's name?");//ask for the first player's name
       p1.setName(myScanner.nextLine());
       System.out.print("what's your gender?");//ask for the first player's gender
       p1.setSex(myScanner.nextLine());
       String firstPlayer = p1.getName();
       p1.setPlayerSymbol('X');//the first player's symbol is X
       System.out.print("Second player's name?");//ask fo the second player's name
       p2.setName(myScanner.nextLine());//use the scanner to input the name
       System.out.print("what's your gender?");//ask for the second player's gender
       p2.setSex(myScanner.nextLine());
       String secondPlayer = p2.getName();
       p2.setPlayerSymbol('O');//the second player's symbol is O
       boolean isFirstPlayer=true;
       boolean gameDone = false;
       char symbol=' ';
       int row=0;
       int col=0;
       while (true){
           if(firstPlayer.equals(secondPlayer)){
               System.out.println("Identical names!");
               System.out.println("Please one of the players enter a different name");
               System.out.print("First player's name?");//ask for the first player's name
               p1.setName(myScanner.nextLine());
               firstPlayer = p1.getName();
               System.out.print("second player's name?");//ask for the first player's name
               p2.setName(myScanner.nextLine());
               secondPlayer = p2.getName();
           }
           else{
               break;
           }
       }
       switch(p1.getSex()){
           case "male":
               System.out.println("player1 is a male");
               break;
           case "female":
               System.out.println("player1 is a female");
               break;
           default:
               System.out.println("unknown");
       }
       switch(p2.getSex()){
           case "male":
               System.out.println("player2 is a male");
               break;
           case "female":
               System.out.println("player2 is a female");
               break;
           default:
               System.out.println("unknown");
       }
       for (int i =0; i<3; i++){//change every position to '-' before the game starts
           Board.gameBoard[i][0]='-';
           Board.gameBoard[i][1]='-';
           Board.gameBoard[i][2]='-';
       }
       while(gameDone==false){//while the game is not done 
           Board.printBoard(Board.gameBoard);//print out the game board
           if (isFirstPlayer){//if it is the first player's turn, use X
               System.out.println(firstPlayer+"'s turn");
               symbol='X';
           }
           else {//if it is the second player's turn, use O
               System.out.println(secondPlayer+"'s turn");
               symbol='O';
           }
           do{
               System.out.print("enter a row number: ");
               row = myScanner.nextInt();//enter the row number
               System.out.print("enter a col number: ");
               col = myScanner.nextInt();//enter the column number
               if (row<0||col<0||row>2||col>2){//if the the symol is out of bound
                   try{
                       Board.gameBoard[row][col]=symbol;
                   }
                   catch (ArrayIndexOutOfBoundsException e){//print an error message
                       System.out.println("out of bound!");
                   }
               }
               else{//if in the bound, break the while loop
                   break;
                   }
           }
           while(true);
           do{
               if (Board.gameBoard [row][col]!='-') {//check if the position has been taken
                   System.out.println("someone has placed a symbol here");
                   System.out.print("enter a row number: ");
                   row = myScanner.nextInt();//enter the row number
                   System.out.print("enter a col number: ");
                   col = myScanner.nextInt();//enter the column number
               }
               else{
                   break;
               }
           }while (true);
           Board.gameBoard[row][col]=symbol;//place the piece at the position
           if (Board.checkWinner(Board.gameBoard)=='X'){//check if there is a winner
               System.out.println(firstPlayer+ " Won the game!");
               gameDone=true;
           }
           else if (Board.checkWinner(Board.gameBoard)=='O'){
               System.out.println(secondPlayer+ " Won the game!");
               gameDone=true;
           }
           else{
               if (Board.tiedGame(Board.gameBoard)){//check if it's a tied game
                   System.out.println("Tied game!");
                   gameDone=true;
               }
               else {
                   isFirstPlayer=!isFirstPlayer;//if the game is not finished, switch the player
               }
           }
       }
       Board.printBoard(Board.gameBoard);//print out the new game board*/
   }
}
