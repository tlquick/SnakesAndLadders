package model;

import java.util.*;
/**
 * Write a description of class Game here.
 * 
 */
public class Game extends Updater
{
    private Player player = new Player("Player");
    private Player computer = new Player("Computer");
    private Dice dice = new Dice();
    private Board board = new Board();
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
    }
    
    /**
     * end - determines if the game is over
     */
    public boolean end()
    {
        int HIGHEST_SCORE = 36;
        return (player.getScore() >= HIGHEST_SCORE || computer.getScore() >= HIGHEST_SCORE);
    }
    /**
     * play - each player has their turn
     */
    public void play()
    {
        play(player);
        play(computer);
    }
    /**
     * play - each player has their turn
     */
    private void play(Player player)
    {
        player.play(dice.roll());
        board.move(player);
    }
    public Player player()
    {
        return player;
    }
    public Player computer()
    {
        return computer;
    }
    /**
     * show - display the data for each player
     */
    public void show()
    {
        String s = "    Player Score: " + player.toString();
        s+="\n    Computer Score: " + computer.toString();
        System.out.println(s);
    }
    
}
