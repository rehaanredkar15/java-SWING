package com.company;

import javax.swing.*;
import java.awt.*;

public class panel extends JFrame {
    panel(){
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(600,400);
        f.setLocation(400,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       /* so here we got the frame set accordingly now we need to set the panel for the frame to put all the components on the frame*/

        JPanel jp = new JPanel(new GridBagLayout());

        JButton b1 = new JButton("button1");
        JButton b2 = new JButton("button2");
          /* we use grid  bag layout to appropriately set the panel information, to arrange the buttons on the grid bag layout
          * we require constraints of gbl*/

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10,10,10,10);  //for spacing
        c.gridx = 0;
        c.gridy = 1;    // to set buttons
        jp.add(b1,c);
        jp.add(b2);
        c.gridx = 0;
        c.gridy = 2;
        f.add(jp);
       // f.add(jp,BorderLayout.WEST);
     //   f.add(jp,BorderLayout.EAST);
    }



    public static void main(String[] args) {
        new panel();

    }
}
