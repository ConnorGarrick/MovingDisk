//MovingDisk program 
/*
 * Syntax and Style
 * Connor Garrick
 * */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MovingDisk extends JPanel
  implements ActionListener
{
  //declare instance field (variable for the object of this class)
  private int time;
  private Timer clock;
  
  
  public MovingDisk() //constructor (same name as class, no return type)
  {
    time = 0; //initialize the instance field
    Timer clock = new Timer(30, this); //initialize the instance field
    clock.start();
  }
  
  public void actionPerformed(ActionEvent e)
  {
    time++;
    repaint();
  }
  
  public void paintComponent(Graphics g)
  {
    //setup the xy pos on a curve (x, y, r are declared as "local" variables
    int x = 150 - (int)(100 * Math.cos(0.005 * Math.PI * time));
    int y = 130 - (int)(75 * Math.sin(0.005 * Math.PI * time));
    int r = 20;
    Color sky;
    
    if(y > 130)
      sky = Color.BLACK;
    else
      sky = Color.CYAN;
    setBackground(sky);
    super.paintComponent(g);
    
    g.setColor(Color.ORANGE);
    g.fillOval(x-r, y-r, 2*r, 2*r);
  }
}
  
  
  
  
  
  
  
  
  
  
  