import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import model.*;

public class PlayPanel extends JPanel implements MyObserver
{
    private GridBagLayout bag = new GridBagLayout();
    private Game game;
    private PlayListener playListener;
    private ControlPanel controlPanel;
    private BoardPanel boardPanel;

    public PlayPanel(Game game)
    {   
        setup();
        this.game = game;
        game.player().attach(this);
        game.computer().attach(this);
        build(game);   
    }

    public void setup()
    {   
        setLayout(bag);    
    }

    public void build(Game game)
    {
        playListener = new PlayListener();
        boardPanel = new BoardPanel(game);
        controlPanel = new ControlPanel(game, playListener);
        add(boardPanel);
        place(boardPanel, 1, 1, 0, 0, 1, 3);
        add(controlPanel);
        place(controlPanel, 1, 1, 0, 1, 1, 1);
    }
    public void update()
    {
        boardPanel.repaint();//refresh positions of the player icons
    }
    private void place(Component comp, int w, int h, int x, int y, double wx, double wy)
    {
        GridBagConstraints cons = new GridBagConstraints();
        cons.gridwidth = w;
        cons.gridheight = h;
        cons.gridx = x;
        cons.gridy = y;
        cons.weightx = wx;
        cons.weighty = wy;
        cons.fill = GridBagConstraints.BOTH;
        bag.setConstraints(comp, cons);
    }
    private class PlayListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (!game.end())
                game.play();
        }
    }
}
