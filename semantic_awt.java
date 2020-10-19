package gui_with_awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class semantic_awt {


    public static void main(String[] args) {

        Frame jm = new Frame("MY frame");
        Label l1 = new Label("First Player");
        Label l2 = new Label("Second Player");

        TextField t1 = new TextField (10);
        TextField t2 = new TextField (10);

        Button b1 = new Button("SWAP");
        jm.add(l1);
        jm.add(t1);
        jm.add(l2);
        jm.add(t2);
        jm.add(b1);

        b1.addActionListener(new ActionListener() {   //here we
            @Override
            public void actionPerformed(ActionEvent e) {

                String temp = t1.getText();
                t1.setText(t2.getText());
                t2.setText(temp);
            }
        });

        jm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        jm.setLayout(new FlowLayout());
        jm.setSize(200,500);
        jm.setVisible(true);

    }
}
