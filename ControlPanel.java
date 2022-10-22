import model.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlPanel extends JPanel implements MyObserver
{
    private JButton name = new JButton("Change Player Name");
    private JLabel position = new JLabel("Position");
    private JTextField computer = new JTextField(5);
    private JTextField player = new JTextField(5);
    private JLabel computerName = new JLabel();
    private JLabel playerName = new JLabel();
    private JButton play = new JButton("Play");
    private Game game;
    
    public ControlPanel(Game game, ActionListener listener)
    {   
        this.game = game;
        game.attach(this);
        game.player().attach(this);
        game.computer().attach(this);
        setup(listener);
        build();
    }
        
    private void setup(ActionListener listener)
    {   
        setBorder(BorderFactory.createLineBorder(Color.blue));
        play.addActionListener(listener);   
        name.addActionListener(new NameListener());
    }
    private void build()
    {   
        add(name);
        add(position);
        computerName.setText(game.computer().getName());
        add(computerName);
        add(computer);
        playerName.setText(game.player().getName());
        add(playerName);
        add(player);
        add(play);
    }
    public void update()
    {           
        playerName.setText(game.player().getName());
        player.setText(Integer.toString(game.player().getScore()));
        computer.setText(Integer.toString(game.computer().getScore()));
    }
     
private class NameListener implements ActionListener
{   
    public void actionPerformed(ActionEvent e)
    {   
        NameWindow nameWindow = new NameWindow(game);
    }
}

}