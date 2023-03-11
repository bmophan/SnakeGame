package snakegame;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SnakeGame extends JFrame {
    public SnakeGame() {
        startGame();
    }
    
    private void startGame() {
        add(new mainScreen());
        setTitle("Snake Game");
        setResizable(false);
        pack();
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame jmain = new SnakeGame();
            jmain.setVisible(true);
        });
    }
}
