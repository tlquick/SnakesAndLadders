package model;

public class SnakeSquare extends Square
{
    public SnakeSquare(int id, String colour, int spacesToMove)
    {
      super(id, colour);
      super.spacesToMove = spacesToMove;
    }
    
    @Override
    public void move(Player player)
    {
        player.move(-spacesToMove);
        System.out.println("Snake! Move back " + spacesToMove);
        super.move(player);
    }
}
