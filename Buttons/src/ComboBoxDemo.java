import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxDemo extends JFrame implements ActionListener {

    JComboBox comboBox;

    public ComboBoxDemo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String[] Subject = {"CPP", "CD", "TOC", "JAVA", "PYTHON"};
        comboBox = new JComboBox(Subject);
        comboBox.addActionListener(this);


        this.add(comboBox);
        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
        }

    }

    public static void main(String[] args) {
        new ComboBoxDemo();
    }

}
