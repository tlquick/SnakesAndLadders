import model.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NameWindow extends JFrame implements MyObserver
{   
    private Game game;
    private JTextField name = new JTextField(10);
    private JButton button = new JButton("Ok");
    private JLabel confirm = new JLabel("");
    private JPanel panel = new JPanel();
    public NameWindow(Game game)
    {  
        this.game = game;
        game.attach(this);
        setup();
        build(game);
        setVisible(true);   
    }
    private void setup()
    {   
        setSize(200, 200);
        setDefaultCloseOperation(HIDE_ON_CLOSE);    
    }     
    private void build(Game game)
    {   
         panel.add(new JLabel("Enter player name"));
         
         name.setText(game.player().getName());
         panel.add(name);
         panel.add(button);
         panel.add(confirm);
         button.addActionListener(new AddListener(game));
         add(panel);
    }
    public void update()
    {           
        confirm.setForeground(Color.blue);
        confirm.setText("Name updated");
    }
    public class AddListener implements ActionListener
    {   
       private Game game;
        public AddListener(Game game)
        {   
          this.game = game;
        }
        public void actionPerformed(ActionEvent e)
        {   
            
                game.player().setName(name.getText());
                update();
        }
    }
}
