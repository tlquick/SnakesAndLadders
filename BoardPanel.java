import model.*;
import java.awt.*;
import javax.swing.*;



public class BoardPanel extends JPanel implements MyObserver
{   
    
    private Game game;
    
    public BoardPanel(Game game)
    {   
        this.game = game;
        game.attach(this);
        game.player().attach(this);
        game.computer().attach(this);
        setup();
        build();
    }
        
    private void setup()
    {   
        setBorder(BorderFactory.createLineBorder(Color.blue)); 
        setBackground(Color.white);
        setPreferredSize(new Dimension(500, 500));
        
    }

    private void build()
    {   
        
    }

  /** paintComponent - overrides parent method
   * redraws all the images on screen
   */
  protected void paintComponent(Graphics g)
  {
        super.paintComponent(g);
        
        Image im = Toolkit.getDefaultToolkit().getImage("board.jpg");    
        g.drawImage(im, 0,0,this.getWidth(),this.getHeight(),this);
        im = Toolkit.getDefaultToolkit().getImage("topHat.jpg");//computer image
        int position = game.computer().getScore();
        g.drawImage(im,getX(position),getY(position),50,50,this);
        im = Toolkit.getDefaultToolkit().getImage("car.jpg");//computer image
        position = game.player().getScore();
        g.drawImage(im,getX(position),getY(position),50,50,this);
  }    
  public int getX(int position)
  {
      int result;
      switch (position)
      {
          case 0:
          case 1: 
          case 12:
          case 13:
          case 24:
          case 25:
          case 36:
              result = 50;
               break;
          case 2: 
          case 11:
          case 14:
          case 23:
          case 26:
          case 35:
              result = 150;
              break;
          case 3:
          case 10:
          case 15:
          case 22:
          case 27:
          case 34:
              result = 250;
              break;
          case 4: 
          case 9:
          case 16:
          case 21:
          case 28:
          case 33:
              result = 350;
              break;
           case 5:
           case 8:
           case 17:
           case 20:
           case 29:
           case 32:
                result = 450;
                break;
          default: 
              result = 550;
              break;
      }
      return result;
    }
  public int getY(int position)
  {
      int result;
      switch (position)
      {
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
                result = 400;
                break;
          case 7:
          case 8:
          case 9:
          case 10:
          case 11:
          case 12:
                result = 325;
                break;
          case 13:
          case 14:
          case 15:
          case 16:
          case 17:
          case 18:
                result = 250;
                break;
          case 19:
          case 20:
          case 21:
          case 22:
          case 23:
          case 24:
                result = 175;
                break;
          case 25:
          case 26:
          case 27:
          case 28:
          case 29:
          case 30:
                result = 100;
                break;
          default: 
              result = 25;
              break;
      }
      return result;
  }
    
    public void update()
    {   
       repaint();
    }


}
