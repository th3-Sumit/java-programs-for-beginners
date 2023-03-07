import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;

public class MyFrame extends Frame implements MouseListener {

    Button b1, b2, b3;
    public MyFrame() {

        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        setTitle("My demo Frame");


    }

    public static void main(String[] args) {
        new MyFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
