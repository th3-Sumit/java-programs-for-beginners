import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo extends JFrame implements ChangeListener {
    JFrame frame;
    JLabel label;
    JPanel panel;
    JSlider slider;

    SliderDemo(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame = new JFrame();
        label = new JLabel();
        panel = new JPanel();
        slider = new JSlider(0, 100, 50);
        slider.setPreferredSize(new Dimension(400, 200));


//        slider.setFont(new Font("MV Boli", Font.PLAIN, 20));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(10);

        slider.setPaintLabels(true);

        slider.addChangeListener(this);


        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("VALUE : "+slider.getValue());
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));



        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("VALUE : "+slider.getValue());

    }

    public static void main(String[] args) {
        new SliderDemo();
    }
}
