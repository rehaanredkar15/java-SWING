package layout_manager;

import javax.swing.*;
import java.awt.*;


/* The FlowLayout is used to arrange the components in a line, one after another (in a flow).
        It is the default layout of applet or panel*/
public class Flow_layout {
    public static void main(String[] args) {

        JFrame jm = new JFrame("RCB IS LOVE");
        JButton button;
        jm.setLayout(new FlowLayout());
        jm.setLayout(new GridLayout(3,3,5,1));
        for(int i= 1; i<10 ; i++)
        {
            button = new JButton();
            button.setPreferredSize(new Dimension(150,150));
            button.setText(""+i);
            jm.add(button);
        }
        jm.setSize(400,400);

        jm.setVisible(true);
    }
}
