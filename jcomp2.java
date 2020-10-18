package jcomponent_;
import javax.swing.*;
import java.awt.*;

/* The JComponent class is the base class of all Swing components except top-level containers.
 Swing components whose names begin with "J" are descendants of the JComponent class.
  For example, JButton, JScrollPane, JPanel, JTable etc.
 But, JFrame and JDialog don't inherit JComponent class because they are the child of top-level containers.*/
public  class jcomp2 extends JComponent {
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(50,50,200,200);
    }



}
