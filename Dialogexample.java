package gui_with_awt;
import java.awt.event.*;
import java.awt.*;

public class Dialogexample {

    private static Dialog d;
    Dialogexample(){

        Frame f = new Frame();
        d = new Dialog(f,"Dialog Bolte",true);
        d.setLayout(new FlowLayout());
        Button b = new Button("OK");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dialogexample.d.setVisible(false);
            }
        });
        d.add(new Label("DABA TOH PUBLIC"));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new Dialogexample();
    }

}
