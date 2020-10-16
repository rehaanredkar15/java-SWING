package com.company;

import javax.swing.*;   //swing is used for gui its the package

public class frame_creation extends JFrame   //inherits from the static Jframe
{
    frame_creation(){
        JFrame frm = new JFrame("framedemo");    //for the creation of new frame
        JButton but = new JButton("click me ");
        frm.add(but);     //adding the clickme button
        but.setBounds(50,50,100,30);   //setting the size of the button
        frm.setBounds(400,100,250,200);
        frm.setLayout(null);        /*this is set first because if we set the size of the frame before setting the
                                          layout to be null then the button we take over the whole frame region */
        frm.setSize(200,200);
        frm.setVisible(true);           //turn off or on the visibility of the frame
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //this is used to end the program when we close the button
    }

    public static void main(String[] args) {
        new frame_creation();  //here we call the function which performs the function of creating the frame

    }
}
