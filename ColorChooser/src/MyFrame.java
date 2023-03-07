import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    public MyFrame() {
        label = new JLabel("This is a text Message.");
        label.setFont(new Font("MV Boli", Font.BOLD, 20));
        button = new JButton("Pic a color");
        button.setFocusable(false);
        button.addActionListener(this);


        this.add(button);
        this.add(label);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.BLACK);
            label.setForeground(color);

        }
    }
}
