import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
public class Caesar extends Frame
{
    Label title, ptext, ktext, ctext;
    Font myFont;
    TextField t1, t2, t3;
    Button b1;
    MouseClickEvent m;
    Caesar()
    {
        setSize(800,800);
        setLayout(null);

        setTitle("Caesar Cipher Encryption");
        setVisible(true);
        addComponents();
    }
    void addComponents()
    {
        title=new Label("Caesar Cipher Encryption");
        title.setBounds(250,100,400,30);
        myFont=new Font("Courier",Font.BOLD,20);
        title.setFont(myFont);
        add(title);

        ptext=new Label("Plain Text");
        ptext.setBounds(50,150,120,20);
        ptext.setFont(myFont);
        add(ptext);

        ktext=new Label("KeySize");
        ktext.setBounds(50,190,100,20);
        ktext.setFont(myFont);
        add(ktext);

        t1=new TextField();
        t2=new TextField();
        t1.setBounds(180,150,500,20);
        add(t1);
        t2.setBounds(180,190,50,20);
        add(t2);

        ctext=new Label("Cipher Text");
        ctext.setBounds(50,220,120,20);
        ctext.setFont(myFont);
        add(ctext);
        t3=new TextField();
        t3.setBounds(180,220, 500,20);
        add(t3);

        b1=new Button("Encrypt");
        b1.setBounds(250,300,100,50);
        b1.setFont(myFont);
        add(b1);
        m=new MouseClickEvent(this);
        b1.addMouseListener(m);

    }
    public static void main(String args[])
    {
        Caesar c1=new Caesar();

    }
}
