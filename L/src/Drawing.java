import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
public class Drawing extends JPanel{
    public int WIDTH = 50;
    public int HEIGHT = 50;
    public int PWIDTH = 600;
    public int PHEIGHT = 400;
    private Random o = new Random();
    public int x = o.nextInt(500);
    public int y = o.nextInt(300);
    public int times = 0;
    public JLabel l = new JLabel("CLICKED");
    public JButton r = new JButton();
    public BufferedImage i;
    public Drawing(){
        setLayout(null);
        setSize(PWIDTH,PHEIGHT);
        clickable();
        
        l.setForeground(Color.red);
        l.setLocation(PWIDTH / 2 - 50, 10);
        l.setSize(WIDTH, HEIGHT);
        l.setVisible(false);
        add(l);
    }
    
    public void paintComponent(Graphics g){
        try{
              i = ImageIO.read(new File("src\\cs_245_blue_circle.png"));
        } catch (IOException e) {
             System.out.println("none");
          }
        JButton r = new JButton(new ImageIcon(i));
        r.setLocation(x, y);
        r.setSize(100,100);
        r.setBorderPainted(false);
        r.setContentAreaFilled(false);
        r.setOpaque(false);
        
        add(r);
        
        
    }
    
    public void clickable(){
        
        r.setLocation(x, y);
        r.setSize(WIDTH,HEIGHT);
        
        r.setBorderPainted(false);
        r.setContentAreaFilled(false);
        add(r);
        r.addActionListener(new ActionListener() {
   
            public void actionPerformed(ActionEvent e) {
                l.setVisible(true);
                
                
            }
        });
    
    }
       public void Randomize(){
           Random z = new Random();
           int i = z.nextInt(500);
           int j = z.nextInt(200);
           r.setLocation(i, j);
           x = i;
           y = j;
           revalidate();
           
       }
    
    
    }
  
            

