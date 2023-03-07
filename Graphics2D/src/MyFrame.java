import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel panel;
    public MyFrame() {
        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLayout(null);


        this.add(panel);
        this.setVisible(true);

    }

}
