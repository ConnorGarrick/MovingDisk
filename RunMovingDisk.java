//Driver class for MovingDisk
import java.awt.Container;
import javax.swing.JFrame;
public class RunMovingDisk
{
  public static void main(String[] args)
  {
    JFrame w = new JFrame("Moving Disk");
    w.setSize(300, 150);
    
    Container c = w.getContentPane();
    c.add(new MovingDisk());
    
    
    //DEFAULT WINDOW OPERATION CONFIG
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    w.setResizable(false);
    w.setVisible(true);
  }
}