import model.*;

import java.awt.*;
import javax.swing.*;

public class GameWindow extends JFrame
{
    public GameWindow(Game game)
    {   
        setup();
        build(game);
        setVisible(true);   
    }
    private void setup()
    {   
        setSize(650, 590);
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
    } 
    private void build(Game game)
    {   
        add(new PlayPanel(game)); 
    }
}
