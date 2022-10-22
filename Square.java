
public class Square 
{
    protected int id;
    protected String colour;
    protected int spacesToMove = 0;
    public Square(int id, String colour)
    {
       this.id = id;
       this.colour = colour;
    }
    public void move(Player player)
    {
        System.out.println(player.toString());
    }

}
