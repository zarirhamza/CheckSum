/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zarir Hamza
 */
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class SwingProgressBarExample extends JPanel {

    static final int MY_MINIMUM = 0;
    static final int MY_MAXIMUM = 100;
    JProgressBar pbar;

    public void updateBar(int newValue) {
        pbar.setValue(newValue);
    }

    public SwingProgressBarExample() {
        pbar = new JProgressBar();
        pbar.setMinimum(MY_MINIMUM);
        pbar.setMaximum(MY_MAXIMUM);
        pbar.setStringPainted(true);
        add(pbar);

    }

    public void pb() {
        final SwingProgressBarExample it = new SwingProgressBarExample();
        JFrame frame = new JFrame("Init");
        JLabel label = new JLabel("Loading", JLabel.CENTER);
        JLabel label4 = new JLabel("           ", JLabel.CENTER);
        JLabel label2 = new JLabel("Intel Hex Programmer", JLabel.CENTER);
        JLabel label3 = new JLabel("By: Zarir, Kunal, Abhishek\n", JLabel.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(it);
        frame.getContentPane().add(label);
        frame.getContentPane().add(label4);
        frame.getContentPane().add(label2);
        frame.getContentPane().add(label3);
        frame.pack();
        frame.setSize(new Dimension(350, 100));
        frame.setVisible(true);
        final String[] labels = {"Loading", "Initalizing", "Starting", "Almost Done", "Working", "Loading", "Starting Engines", "Loading", "Loading", "Loading", "Done"};
        for (double i = 0; i <= 100; i += 1) {
            final double percent = i;
            try {
                Runnable runner = new Runnable() {
                    public void run() {
                        if(percent %7 == 0 || percent %5 == 0 || percent %3 == 0){
                        it.updateBar((int) percent);
                        it.update(it.getGraphics());
                        }
                        System.out.println("sadasdas");
                    }
                };
                Thread t = new Thread(runner, "Code Executer");
                t.start();
                label.setText(labels[(int)i / 10]);
                label.setSize(label.getPreferredSize());
                java.lang.Thread.sleep(100);
            } catch (InterruptedException e) {
                ;
            }
        }
        frame.setVisible(false);
    }
}
