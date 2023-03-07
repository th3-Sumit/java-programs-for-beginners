import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox extends JFrame implements ActionListener {
    JCheckBox checkBox1, checkBox2, checkBox3;
    JButton button = new JButton();

    public CheckBox() {

        button.setText("Submit");
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());



        this.pack();
        this.addComponents();
        this.setVisible(true);

    }
    public void addComponents(){
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();

        checkBox1.setText("I'm not a ROBOT");
        checkBox1.setFocusable(false);
        checkBox1.setFont(new Font("Consolas", Font.PLAIN, 25));

        checkBox2.setText("TOC");
        checkBox2.setFocusable(false);
        checkBox2.setFont(new Font("Consolas", Font.PLAIN, 25));

        checkBox3.setText("CPP");
        checkBox3.setFocusable(false);
        checkBox3.setFont(new Font("Consolas", Font.PLAIN, 25));


        add(checkBox1);
        add(checkBox2);
        add(checkBox3);
        add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println(checkBox1.isSelected());

        }


    }

    public static void main(String[] args) {
        new CheckBox();
    }
}
