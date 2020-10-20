package gui_with_awt;


import java.awt.*;
import java.awt.event.*;

public class choice {
    Panel p = new Panel();
    Choice ch = new Choice();
    List ls = new List();
    Frame f;
    public choice() {
         f = new Frame("CHOICE AND LIST");
        f.setLayout(new GridLayout(1, 1));
        f.setSize(400, 400);

        additemtolist();
        additemtochoice();
        additemtoframe();
        f.setVisible(true);


    }

    public static void main(String[] args) {
        choice obj = new choice();


    }
    public void additemtolist(){
        ls.add("mango");
        ls.add("apple");
        ls.add("Orange");
        p.add(ls);
    }
   private void additemtochoice(){

        ch.add("mango");
        ch.add("apple");
        ch.add("Orange");
        p.add(ch);
   }
   private void additemtoframe(){

        f.add(p);

   }
}
