import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Button extends JFrame implements MouseListener {
    public static void main(String[] args) {
        new Button();
    }

    JButton a = new JButton("Color button");
    JButton b = new JButton("Color text");


    public Button() {
        super("Test window");
        setSize(new Dimension(300, 100));
        setLayout(new GridBagLayout());

        a.setFocusable(false);
        a.setBackground(Color.GREEN);
        a.addMouseListener(this);
        getContentPane().add(a);

        b.setFocusable(false);
        b.setBackground(Color.white);
        b.addMouseListener(this);
        getContentPane().add(b);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        a.setBackground(Color.BLUE);
        b.setForeground(Color.MAGENTA);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        a.setBackground(Color.GREEN);
        b.setForeground(Color.ORANGE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        a.setBackground(Color.CYAN);
        b.setForeground(Color.PINK);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        a.setBackground(Color.GRAY);
        b.setForeground(Color.RED);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        a.setBackground(Color.GREEN);
        b.setForeground(Color.YELLOW);
    }

}

