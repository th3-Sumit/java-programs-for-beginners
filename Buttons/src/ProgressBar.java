import javax.swing.*;
import java.awt.*;

public class ProgressBar extends JFrame {
    JProgressBar progressBar = new JProgressBar();
    JLabel label = new JLabel();
    public ProgressBar() {

        progressBar.setValue(0);
        progressBar.setBounds(0, 0, 500, 50);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("MV Boli", Font.BOLD, 25));
        progressBar.setForeground(Color.ORANGE);
        progressBar.setBackground(Color.black);

        label.setBounds(0, 50, 500, 50);
        label.setText("Hello Monster" );
        label.setBackground(Color.pink);
        label.setOpaque(true);
        label.setFont(new Font("MV Boli", Font.BOLD, 20));
        label.setVerticalAlignment(JLabel.CENTER);

        label.setVisible(true);


        add(label);
        add(progressBar);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        setVisible(true);
        fill();
    }
    public void fill(){
        int counter = 0;
        while(counter<=100){
            progressBar.setValue(counter);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 1;
        }
        progressBar.setString("<-- Hello Monst3r -->");

    }

    public static void main(String[] args) {
        new ProgressBar();
    }
}
