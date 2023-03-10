package snakegame;

import java.awt.EventQueue;
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
        Window w = new Window(s);
        
        add(w);
        setTitle("Snake Game");
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        s.setInGame(true);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame jmain = new SnakeGame();
            jmain.setVisible(true);
        });
    }
}
