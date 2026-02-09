package dinodump;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DinoDay2{
    public static void main (String [] args){

        JFrame gameF = new JFrame();

        gameF.setSize(700,400);
        gameF.setTitle("DinoRawr!!!");
        gameF.setLocationRelativeTo(null);



        GamePanel containF = new GamePanel();

        containF.setSize(699,399);
        containF.setBackground(Color.decode("#000260"));
        gameF.add(containF);
        gameF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameF.setVisible(true);

    }
}
//creating a new class called GamePanel
    // extends JPanel=> means we make GamePanel a JPanel 
    //@Override => we're replacing a method from a parent class with our 
    //own version in this case its a (JPanel)
 class GamePanel extends JPanel implements KeyListener{ //i got an error when i put it inside the DinoMain class so i had to put it outside
        
    //draw dino (logic only) position + size
    int dinoX = 50;
    int dinoY= 100;
    int dinoWidth= 45;
    int dinoHeight= 45;

                //key press logic / Constructor 
                        public GamePanel () { 
                        setFocusable(true);
                        addKeyListener(this);
                        }
    
    @Override 
        protected void paintComponent (Graphics g) { //you can change any letter here
            super.paintComponent(g); //paintCompnent is a reserve keyword

            //drawing dino using the variable constraints (from above)
            g.setColor(Color.decode("#fffd80"));
            g.fillRect(dinoX,dinoY,dinoWidth,dinoHeight);
    
        } 

        //key Listener Methods
    @Override 
    public void keyPressed (KeyEvent e){
           if (e.getKeyCode() == KeyEvent.VK_SPACE){
            dinoY -= 80;
            
            repaint();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
    
    @Override
     public void keyTyped(KeyEvent e){
        
     }
            
    }
//Quick Note:
// KeyListener makes dino jump
// repaint() redraws the panel
// paintComponent draws dino rectangle
