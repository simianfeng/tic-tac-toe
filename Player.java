
/**
 * this is the player blueprint class for the tic tac toe 
 * game, it contains the players names and the symbols they
 * are going to use in during the game.
 * @Simon Feng
 * @2020.12.12
 * time: 2:03
 */
import java.util.*;
public class Player
{
    private String name;//player's name
    private String sex;
    private char playerSymbol;//player's symbol
    public Player(){};//default constructor
    public Player(String name, char playerSymbol){//the constructor that takes two arguments
        this.name=name;
        this.playerSymbol=playerSymbol;
    }
    public void setName(String name){//the setter for name
        this.name=name;
    }
    public String getName(){//the getter for name
        return name;
    }
    public void setSex(String sex){//the setter for name
        this.sex=sex;
    }
    public String getSex(){//the getter for name
        return sex;
    }
    public void setPlayerSymbol(char playerSymbol){//the setter for player symbol
        this.playerSymbol=playerSymbol;
    }
    public char getPlayerSymbol(){//the getter for player symbol
        return playerSymbol;
    }
}
