
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Stp implements ActionListener{
     private JButton rb = new JButton();
     private JButton bb = new JButton();
     private JButton yb = new JButton();
     private JButton gb = new JButton();
     private JButton pb = new JButton();
     
     private int Score = 100;   //dummy score variable; replace with real one
     JPanel p = new JPanel();
     JFrame j = new JFrame();
     public JLabel l = new JLabel("Purple");
    public void set(){
    
        j.setPreferredSize(new Dimension(600,400));
        j.setSize(j.getPreferredSize());
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setForeground(Color.red);
        l.setLocation(600 / 2 - 50, 10);
        l.setBackground(Color.black);
        l.setSize(50, 50);
        l.setVisible(true);
       
        
        p.setLayout(null);
        p.setSize(600,400);
        p.setBackground(Color.black);
        p.add(l);
        
       
        rb.setIcon(new ImageIcon("src\\cs_245_red_circle.png"));
        bb.setIcon(new ImageIcon("src\\cs_245_blue_circle.png"));
        yb.setIcon(new ImageIcon("src\\cs_245_yellow_circle.png"));
        gb.setIcon(new ImageIcon("src\\cs_245_green_circle.png"));
        pb.setIcon(new ImageIcon("src\\cs_245_purple_circle.png"));
        
        
        
        LvOne();
        
        
}
    public void BSup(JPanel p, JButton r, int x, int y, String s){
        r.setLocation(x, y);
        r.setSize(100,100);
        r.setBorderPainted(false);
        r.setContentAreaFilled(false);
        r.setActionCommand(s);
        r.addActionListener(this);
        p.add(r);
    }
    
    public void LvOne()
    {
        
        BSup(p, bb, 50, 50, "w");
        BSup(p, rb, 200, 75, "w");
        BSup(p, yb, 400, 20, "w");
        BSup(p, gb, 20, 200, "w");
        BSup(p, pb, 400,180, "Right1");
        j.add(p);
        j.validate();
        
    }
    
    public void LvTwo(){
        
        
        BSup(p, bb, 75, 80, "w");
        BSup(p, rb, 340, 220, "w");
        BSup(p, gb, 405, 98, "Right2");
        BSup(p, pb, 200,120, "w");
        BSup(p, yb, 25, 245, "w");
        p.revalidate();
        j.revalidate();
        
        
    }
    
    public void LvThree(){
        BSup(p, bb, 400, 10, "Right3");
        BSup(p, rb, 100, 50, "w");
        BSup(p, gb, 10, 200, "w");
        BSup(p, pb, 140, 250, "w");
        BSup(p, yb, 287, 170, "w");
        p.revalidate();
        j.revalidate();
    }
    public void actionPerformed(ActionEvent e) {
    l.setVisible(true);
                if(e.getActionCommand().equals("Right1")){
                l.setText("Green");
                l.setForeground(Color.blue);
                l.setVisible(true);
                 LvTwo();
                j.revalidate();
               
                }else if(e.getActionCommand().equals("Right2")){
                   LvThree(); 
                   l.setText("Blue");
                   l.setForeground(Color.orange);
                   j.revalidate();
                }else if(e.getActionCommand().equals("Right3")){
                    /*
                    insert method to exit to scoreboard here
                    */
                
                }else if(e.getActionCommand().equals("w")){
                    Score = Score - 10;
                }
                }
    
}
