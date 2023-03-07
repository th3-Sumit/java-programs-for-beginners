import javax.swing.*;
import java.awt.*;

public class NewWindow extends JFrame {

    JLabel label = new JLabel();

    public NewWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);

        label.setText("Hello Monst3r");
        label.setBounds(20, 20, 400, 40);
        label.setFont(new Font("MV Boli", Font.PLAIN, 30));

        add(label);

        setVisible(true);

    }
}
