import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class BB extends JPanel implements ActionListener{
  
      private BufferedImage blue = null;
      private BufferedImage red = null;
      private BufferedImage yellow = null;
      private BufferedImage green = null;
      private BufferedImage purple = null;
      public int PWIDTH = 600;
      public int PHEIGHT = 400;
     
      public int size = 50;
      public JLabel l = new JLabel("Wrong");
      private JButton rb = new JButton();
      private JButton bb = new JButton();
      private JButton yb = new JButton();
      private JButton gb = new JButton();
      private JButton pb = new JButton();
    public BB() {
        setLayout(null);
        setSize(PWIDTH,PHEIGHT);
        
        l.setForeground(Color.red);
        l.setLocation(PWIDTH / 2 - 50, 10);
        l.setBackground(Color.black);
        l.setSize(50, 50);
        l.setVisible(false);
        add(l);
        
        JButton r = new JButton();
        
        
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        try{
              blue = ImageIO.read(new File("src\\cs_245_blue_circle.png"));
        } catch (IOException e) {
             System.out.println("none");
          }
        
        
        try{
              red = ImageIO.read(new File("src\\cs_245_red_circle.png"));
        } catch (IOException e) {
             System.out.println("none");
          }
        
        
        try{
              yellow = ImageIO.read(new File("src\\cs_245_yellow_circle.png"));
        } catch (IOException e) {
             System.out.println("none");
          }
        
        
        try{
              green = ImageIO.read(new File("src\\cs_245_green_circle.png"));
        } catch (IOException e) {
             System.out.println("none");
          }
        
        
        try{
              purple = ImageIO.read(new File("src\\cs_245_purple_circle.png"));
        } catch (IOException e) {
             System.out.println("none");
          }
       
        
        
        LvOne();
        
    }
    
    public void BSup(JButton r, BufferedImage k, int x, int y, String s){
        r.setIcon(new ImageIcon(k));
        r.setLocation(x, y);
        r.setSize(100,100);
        r.setBorderPainted(false);
        r.setContentAreaFilled(false);
        r.setActionCommand(s);
        r.addActionListener(this);
        add(r);
    }
    public void LvOne()
    {
        
        BSup(bb, blue, 50, 50, "w");
        BSup(rb, red, 200, 75, "w");
        
        BSup(yb, yellow, 400, 20, "w");
        BSup(gb, green, 20, 200, "w");
        BSup(pb, purple, 400,180, "Right");
        
        
    }
    
    public void cleanUp(){
        
    }
    public void LvTwo(){
        removeAll();
        revalidate();
        repaint();
        System.out.println("All removed");
        BSup(bb, blue, 75, 80, "w");
        BSup(rb, red, 100, 205, "w");
        BSup(yb, yellow, 25, 275, "w");
        BSup(gb, green, 405, 98, "w");
        BSup(pb, purple, 200,100, "w");
        
        
        
    }

    
    public void actionPerformed(ActionEvent e) {
    l.setVisible(true);
                if(e.getActionCommand().equals("Right")){
                l.setText("Correct");
                l.setVisible(true);
                LvTwo();
                }
    }
    
}
