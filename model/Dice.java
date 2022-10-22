package model;

public class Dice
{
    private final int SIDES = 6;
    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
    }
    /**
     * roll - rolls the dice 
     */
    public int roll()
    {
	 return (int) ((Math.random()*SIDES)+1); 
    }
}
