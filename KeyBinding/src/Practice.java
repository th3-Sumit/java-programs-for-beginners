import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Practice {
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action righAction;

    public Practice() {
        frame = new JFrame("KeyBinding practical :)");
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel();
        label.setBackground(Color.magenta);
        label.setBounds(0, 0, 100, 100);
        label.setOpaque(true);


        upAction = new upAction();
        downAction = new downAction();
        leftAction = new leftAction();
        righAction = new rightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "up");
        label.getActionMap().put("up", upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "down");
        label.getActionMap().put("down", downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "left");
        label.getActionMap().put("left", leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "right");
        label.getActionMap().put("right", righAction);


        frame.add(label);
        frame.setVisible(true);
    }
    public class upAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-10);
        }
    }
    public class downAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);
        }
    }
    public class leftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10, label.getY());
        }
    }
    public class rightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10, label.getY());
        }
    }


}
