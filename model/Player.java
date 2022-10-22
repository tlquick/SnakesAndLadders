package model;


/**
 * Write a description of class Player here.
 */
public class Player extends Updater
{
   private int score = 0;
   private String name;

    /**
     * Constructor for objects of class Player
     */
    public Player(String name)
    {
       this.name = name;
    }
    /**
     * play - roll the dice and increment the score
     */
    public void play(int number)
    {
        System.out.println(name + " rolled a " + number);
        move(number);
    }   
    /**
     * move - move the player position
     */
    public void move(int number)
    {
        score += number;
        updateViews();
    }
    /**
     * getScore - returns the value of the score attribute
     */
    public int getScore()
    {
        return score;
    }
    /**
     * getName - returns the value of the name attribute
     */
    public String getName()
    {
        return name;
    }
    /**
     * setName - set the value of the name attribute
     */
    public void setName(String name)
    {
        this.name = name;
        updateViews();
    }
    /**
     * toString - returns the value of the attributes as a String
     */
    public String toString()
    {
        return name + " " + score;
    }
}
