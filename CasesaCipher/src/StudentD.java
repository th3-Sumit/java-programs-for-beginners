import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class StudentD extends Frame {
    TextField Rtext, NText, AddText;
    Label RNo, SName, SAdd, Class, Semester, Subject, title;
    Font myFont;
    //    RadioButton Sem;
    Checkbox BTech, BCA, MCA;
    Choice Sem, subj;

    Button b1;

    ButtonGroup group = new ButtonGroup();


    public StudentD() {
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        addComponents();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });


    }
    void addComponents(){

        title = new Label("Students Details");
        title.setBounds(200, 30, 200, 50);
        title.setForeground(Color.black);
        myFont=new Font("Courier",Font.BOLD,20);
        title.setFont(myFont);

        add(title);


        RNo = new Label("Reg. No: ");
        RNo.setBounds(30, 100, 100, 30);
        RNo.setVisible(true);
        add(RNo);

        SName= new Label("S Name: ");
        SName.setBounds(30, 140, 100, 30);
        SName.setVisible(true);
        add(SName);

        SAdd = new Label("S Add: ");
        SAdd.setBounds(30, 180, 100, 30);
        SAdd.setVisible(true);
        add(SAdd);

        Rtext = new TextField();
        Rtext.setBounds(150, 100, 200, 30);
        Rtext.setVisible(true);
        add(Rtext);


        NText = new TextField();
        NText.setBounds(150, 140, 200, 30);
        NText.setVisible(true);
        add(NText);


        AddText = new TextField();
        AddText.setBounds(150, 180, 200, 100);
        AddText.setVisible(true);
        add(AddText);


        Class = new Label("Class: ");
        Class.setBounds(30, 300, 100, 30);
        Class.setVisible(true);
        add(Class);

        BTech = new Checkbox("B.Tech");
        BTech.setBounds(150, 300, 80, 30);
        add(BTech);

        BCA= new Checkbox("BCA");
        BCA.setBounds(235, 300, 80, 30);
        add(BCA);

        MCA = new Checkbox("MCA");
        MCA.setBounds(320, 300, 80, 30);
        add(MCA);


        Semester = new Label("Semester: ");
        Semester.setBounds(30, 340, 100, 30);
        Semester.setVisible(true);
        add(Semester);
        Sem = new Choice();
        Sem.setBounds(150, 340, 150, 30);
        Sem.add("1st");
        Sem.add("2nd");
        Sem.add("3rd");
        Sem.add("4th");
        Sem.add("5th");
        Sem.add("6th");
        Sem.add("7th");
        Sem.add("8th");
        add(Sem);


        Subject = new Label();
        Subject.setBounds(30, 400, 100, 30);
        Subject.setVisible(true);
        add(Subject);


//        subj.setBounds(200, 380, 100, 50);
//        subj= new Choice();
//        subj.add("JAVA");
//        subj.add("C++");
//        subj.add("PYTHON");
//        subj.add("C");
//        subj.add("CN");
//        subj.add("CD");
//        subj.add("TOC");
//        add(subj);





        b1=new Button("Submit");
        b1.setBounds(200,500,150,70);
        b1.setFont(myFont);
        add(b1);





    }

    public static void main(String[] args) {
        new StudentD();
    }
}
