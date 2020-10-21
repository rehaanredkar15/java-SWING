package gui_with_awt;

import javax.swing.*;
import java.awt.*;
public class Look_feel {

    JFrame jf;
    JButton b;
    JLabel l;
    JTextField tf;
      Look_feel(String title){
          try{
              UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
              // Motif

                // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //Native
              // UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); //Metal     this is various look and feel

             // UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
          }
          catch (Exception e ) {
              e.printStackTrace();  //prints the stack trace of the exception
          }
          jf=new JFrame(title);
           jf.setVisible(true);
           jf.setSize(400,400);
            b=new JButton("Ok");
            l=new JLabel("Welcome to App");
            tf=new JTextField(10);jf.setLayout(new FlowLayout());
          jf.add(l);
         jf.add(tf);
         jf.add(b);
          jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         };


    public static void main(String[] args) {
          Look_feel lf = new Look_feel("Swing Frame");

    }
}
