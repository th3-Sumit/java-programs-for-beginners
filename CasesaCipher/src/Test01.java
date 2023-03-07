import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test01 extends Frame
{
    Label title, pText, KText, Etext;
    TextField t1, t2, t3;
    Font myFont;

    public Test01() {
        setSize(500, 700);
        setVisible(true);
        setLayout(null);
        setTitle("Test_01");
        addComponents();



        //To close the window
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }

    void addComponents(){
        title = new Label("Caeser Cipher");
        title.setBounds(100, 100, 300, 50);
        title.setVisible(true);
        myFont=new Font("Courier",Font.BOLD,30);
        title.setBackground(Color.lightGray);
        title.setFont(myFont);
        add(title);



    }

    public static void main(String[] args) {
        new Test01();
    }
}
