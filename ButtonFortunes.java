import javax.swing.*;
import java.awt.*; // this is needed for hex codes
public class ButtonFortunes{
    public static void main (String[] args){
        JFrame frame = new JFrame ("Cosmic Luck");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,800);
    

        //Compunyetas/Componets
        JLabel label = new JLabel ("Your Fortune Awaits! Choose what resonates!");
        label.setFont(new Font ("SansSerif", Font.BOLD, 20));
        label.setForeground(Color.decode("#f4ffc4"));

        //Butiniz/Buttons
        JButton bt1 = styledB("🌈");
        JButton bt2 = styledB("★");
        JButton bt3 = styledB("✿");
        JButton bt4 = styledB("☯");
        JButton bt5 = styledB("☀");
        JButton bt6 = styledB("☘");
        JButton bt7 = styledB("❄");
        JButton bt8 = styledB("☁");


        //Option pane messages for each button
        //"frame" here is the parent componet if we put null here the dialog box will pop up in center
        bt1.addActionListener(e-> {
            JOptionPane.showMessageDialog(frame, "Your fortune is bright and colorful!");
        });
        bt2.addActionListener(e-> {
            JOptionPane.showMessageDialog(frame, "You are a star in the making!");
        });
        bt3.addActionListener(e-> {
            JOptionPane.showMessageDialog(frame, "Tara absent tayo :D");

        });
        bt4.addActionListener(e-> {
            JOptionPane.showMessageDialog(frame, "Balance is key to a happy life! Kaso.... ");
        });
        bt5.addActionListener(e-> {
            JOptionPane.showMessageDialog(frame, "You will shine and radiate positivity!");
        });
        bt6.addActionListener(e-> {
            JOptionPane.showMessageDialog(frame, "Good luck and prosperity will come your way! Makakapulot ka ng bente >.<");
        });
        bt7.addActionListener(e-> {
            JOptionPane.showMessageDialog(frame, "Embrace the chill and find peace within! Walang yayakap sayo multo lang");
        });
        bt8.addActionListener(e-> {
            JOptionPane.showMessageDialog(frame, "Let your dreams take flight! yoy will die anyways");
        });
        
       //panel for buttons
       JPanel btnpanel = new JPanel (new GridLayout(2,4, 50, 50)); //row x col x hgap x vgap
       btnpanel.setBackground(Color.decode("#ea9090"));

       

       btnpanel.add(bt1);
       btnpanel.add(bt2);
       btnpanel.add(bt3);
       btnpanel.add(bt4);
       btnpanel.add(bt5);
       btnpanel.add(bt6);
       btnpanel.add(bt7);
       btnpanel.add(bt8);

       // but we still need to wrap so it wont stretch crazy: 
       JPanel btnwrap = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));//hgpap,vgap
       btnwrap.setBackground(Color.decode("#ea9090"));
       btnwrap.add(btnpanel);



       //panel for label cuz for space wth
       JPanel labelpanel = new JPanel();
         labelpanel.add(label);
         labelpanel.setBackground(Color.decode("#ea9090"));
         labelpanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 90, 0)); //top, left, bellow, right

        //panel lalagyan main
        JPanel panel = new JPanel(new BorderLayout(10, 10)); //hgap, vgap
      
        panel.setBackground(Color.decode("#ea9090"));
        panel.add(labelpanel, BorderLayout.NORTH);
        panel.add(btnwrap, BorderLayout.CENTER);
        

        //visibility logic
        frame.add(panel);
        frame.setVisible(true);


    }
    // helper method to fix ugly buttons and 
    //we are lazy so we don't want to type the same code again and again
    public static JButton styledB (String text){
        JButton btn = new JButton (text);
        btn.setFont (new Font("Noto Color Emoji", Font.PLAIN, 30));
        btn.setBackground(Color.decode("#bdecca"));
        btn.setFocusPainted(false); //removes the ugly border when clicked

        //since this is not a void method, we need to return something
        return btn;
    }
}