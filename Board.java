
/**
 * this is the blueprint class for Board, it has a static variable
 * called gameboard, which is a board of size 3x3 that will be used 
 * for the game, it also contains three methods, the first method is
 * a boolean method called tiedGame, it returns a boolean value 
 * that tells the players whether it is a tied game. The second method
 * called checkWinner, it checks if there are three identical symbols in
 * a row, whether vertically, horizontally or diagonally, if there is a
 * winner, it will return the player's symbol('O' OR 'X'), if their is not a
 * winner yet, it will return '-'. The third method is printBoard, this 
 * method simply prints out the symbol at each position.
 * 
 */
public class Board
{
   static char[][] gameBoard = new char[3][3];//a static two demensional game board
   public Board(){};//default constructor
   public Board(char[][] gameBoard){//the constructor that takes one argument
       this.gameBoard= gameBoard;
   }
   public static boolean tiedGame(char[][]board){//if there is still '-' at any position, that means there is not a tied game yet.
       for (int i = 0; i<3; i++){
               if (board[i][0]=='-'){
                   return false;
               }
               else if (board[i][1]=='-'){
                   return false;
               }
               else if (board[i][2]=='-'){
                   return false;
               }
       }
       return true;//if all positions have been occupied by O or X, and the game is not finished, that's a tied game
   }
   public static char checkWinner(char[][] board){
       //check the rows, if there are three identical symbols in a horizontal row, print out the winner's symbol
     for(int i=0; i<3; i++){
         if (board[i][0]==board[i][1] && board[i][1]==board[i][2] && board[i][0]!='-'){
             return board[i][0];
         }
     }  
     //check the columns, if there are three identical symbols in a vertical columns, print out the winner's symbol
     for (int j=0; j<3; j++){
        if (board[0][j]==board[1][j] && board[1][j]==board[2][j] && board[1][j]!='-'){
             return board[0][j];
         } 
     }
     //check if there are three identical symbols on the 1-5-9 diagonal line 
     if (board[0][0]==board[1][1] && board[1][1]==board[2][2]&& board[0][0]!='-'){
         return board[0][0];
     }
     //check if there are three identical symbols on the 3-5-7 diagonal line 
     if (board[2][0]==board[1][1] && board[1][1]==board[0][2]&& board[0][0]!='-'){
         return board[2][0];
     }
     return '-';//if there is not a winner yet, return '-'
   }
   public static void printBoard (char[][] board){
       for(int i =0; i<3;i++){
           System.out.print(board[i][0]);//print out the symbol at each psotion.
           System.out.print(board[i][1]);
           System.out.print(board[i][2]);
           System.out.println();
       }
   }
}
