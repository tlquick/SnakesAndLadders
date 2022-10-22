package model;

public class LadderSquare extends Square
{
    public LadderSquare(int id, String colour, int spacesToMove)
    {
      super(id, colour);
      super.spacesToMove = spacesToMove;
    }
    @Override
    public void move(Player player)
    {
        player.move(spacesToMove);
        System.out.println("Ladder! Move forward " + spacesToMove);
        super.move(player);
    }
}