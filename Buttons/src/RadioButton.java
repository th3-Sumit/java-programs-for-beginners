import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton extends JFrame implements ActionListener {
    JRadioButton Cpp, CD, TOC;
    public RadioButton() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        Cpp = new JRadioButton("CPP");
        CD = new JRadioButton("CD");
        TOC = new JRadioButton("TOC");

        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(Cpp);
        bgroup.add(CD);
        bgroup.add(TOC);

        Cpp.addActionListener(this);
        CD.addActionListener(this);
        TOC.addActionListener(this);


        this.add(Cpp);
        this.add(CD);
        this.add(TOC);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Cpp){
            System.out.println("CPP is selected.");

        } else if (e.getSource()==CD) {
            System.out.println("CD is selected.");

        } else if (e.getSource()==TOC) {
            System.out.println("TOC is selected.");
        }

    }
}
