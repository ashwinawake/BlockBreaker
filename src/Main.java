import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Trillo");
        JFrame startScreen = new JFrame();
        JButton start = new JButton("Start");
        start.addActionListener(listener -> {
            startScreen.setVisible(false);
            frame.setVisible(true);
        });
        BlockBreakerPanel panel = new BlockBreakerPanel();
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(490, 600);
        frame.setResizable(false);

        startScreen.getContentPane().add(start);
        startScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startScreen.setVisible(true);
        startScreen.setSize(490, 600);
        startScreen.setResizable(false);

    }
}
