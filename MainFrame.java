import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;


public class MainFrame extends JFrame {

    MainFrame() {
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setLayout(null);

        Win win = new Win();

        JButton openWin = new JButton("open new Win");
        openWin.setSize(150, 30);
        openWin.setLocation(300, 20);
        openWin.addActionListener(e -> win.open());
        add(openWin);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }

}

class Win extends JFrame {

    Win() {
        setSize(new Dimension(300, 100));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

        setLayout(null);
        JButton button = new JButton("button");
        button.setSize(100, 50);
        button.setLocation(0, 0);
        add(button);

        addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {

            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                setVisible(false);
            }
        });
    }

    void open() {
        setVisible(true);
    }

}