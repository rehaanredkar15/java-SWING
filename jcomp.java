package jcomponent_;

import javax.swing.*;

public class jcomp {
    public static void main(String[] args) {
        jcomp2 com = new jcomp2();
        JFrame frame = new JFrame();
         frame.setSize(300,300);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.add(com);
         frame.setVisible(true);
    }
}
