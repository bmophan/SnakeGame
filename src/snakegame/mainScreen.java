package snakegame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.Timer;

class mainScreen extends JPanel implements ActionListener {
    
    Window w;
    ScoreBoard sb;
    Settings s;
    
    public mainScreen() {
        s = new Settings();
        w = new Window(s);
        sb = new ScoreBoard(s);
        addKeyListener(new EventHandling(s));
        
        initMainScreen();
        initGame();
    }
    
    private void initMainScreen() {
        JPanel p1 = new JPanel();
        p1.add(w);
        
        JPanel p2 = new JPanel();
        p2.add(sb);
        
        setLayout(
                new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(p2);
        add(p1);
        
        setFocusable(true);
    }
    
    private void initGame() {
        s.setInGame(true);
        s.setSSpeed(140);
        s.setScore(0);
        s.setSLength(3);
        
        for (int i = 0; i < s.getSLength(); i++) {
            s.setX(i, 30 - i * 10);
            s.setY(i, 100);
        }
        
        s.setLeftDirection(false);
        s.setRightDirection(true);
        s.setUpDirection(false);
        s.setDownDirection(false);
        
        w.locateApple();

        s.setTimer(new Timer(s.getSSpeed(), this));
        s.getTimer().start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (s.getInGame()) {
            
            w.eatApple();
            w.checkCollision();
            w.move();
        }
        
        repaint();
    }
}
