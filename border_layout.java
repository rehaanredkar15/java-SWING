package layout_manager;

import javax.swing.*;
import java.awt.*;

/*The BorderLayout is used to arrange the components in five regions: north, south, east, west and center.
        Each region (area) may contain one component only.*/
public class border_layout {
    public static void main(String[] args) {
        JFrame jfrm = new JFrame("The coder is BOSS");
        JPanel jp = new JPanel();
        jp.setBackground(Color.BLACK);
        jp.setPreferredSize(new Dimension(100,100));
        /* here we have created the panel now we will arrange the panel according to the border layout*/
        jfrm.add(jp,BorderLayout.WEST);


        JPanel jp2 = new JPanel();
        jp2.setBackground(Color.YELLOW);
        jp2.setPreferredSize(new Dimension(100,100));
        jfrm.add(jp2,BorderLayout.EAST);

        JPanel jp3 = new JPanel();
        jp3.setBackground(Color.RED);
        jp3.setPreferredSize(new Dimension(300,50));
        jfrm.add(jp3,BorderLayout.NORTH);

        JPanel jp4 = new JPanel();
        jp4.setBackground(Color.WHITE);
        jp4.setPreferredSize(new Dimension(300,50));
        jfrm.add(jp4,BorderLayout.SOUTH);


        JPanel jp5 = new JPanel();
        jp5.setBackground(Color.BLUE);
        jp5.setPreferredSize(new Dimension(50,50));
        jfrm.add(jp5,BorderLayout.CENTER);


        jfrm.setSize(400,400);
        jfrm.setVisible(true);
    }
}
