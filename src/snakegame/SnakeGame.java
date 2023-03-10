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
        Settings s = new Settings();
        
        JPanel p1 = new JPanel();
        p1.add(new Window(s));
        p1.setBounds(10, 50, 300, 305);
        
        JPanel p2 = new JPanel();
        p2.add(new ScoreBoard(s));
        p2.setBounds(10, 10, 300, 40);
        
        add(p1);
        add(p2);
        
        setLayout(null);
        setTitle("Snake Game");
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setBounds(500, 200, 335, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame jmain = new SnakeGame();
            jmain.setVisible(true);
        });
    }
}
