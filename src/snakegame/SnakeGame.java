package snakegame;

import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class SnakeGame extends JFrame implements Runnable {
    public SnakeGame() {
        startGame();
    }
    
    private void startGame() {
        run();
    }
    
    @Override
    public void run() {
        JPanel panel = new JPanel();
        panel.add(new Window(new Settings()));
        panel.setBounds(10, 10, 300, 305);
        
        add(panel);
        setLayout(null);
        setTitle("Snake Game");
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setBounds(500, 200, 335, 365);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame jmain = new SnakeGame();
            jmain.setVisible(true);
        });
    }
}
