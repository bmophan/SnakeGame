package snakegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

class Window extends JPanel {
    
    Settings s;
    
    public Window(Settings s) {
        this.s = s;
        
        initWindow(s.getWindowWidth(), s.getWindowHeight());
        AddImage();
    }
    
    private void initWindow(int W_WIDTH, int W_HEIGHT) {
        setBackground(Color.BLACK);
        setFocusable(true);
        setPreferredSize(new Dimension(W_WIDTH, W_HEIGHT));
    }
    
    private void AddImage() {
        ImageIcon ii;
        
        ii = new ImageIcon("src/snakegame/head.png");
        s.setImageHead(ii.getImage());
        
        ii = new ImageIcon("src/snakegame/dot.png");
        s.setImageBody(ii.getImage());
        
        ii = new ImageIcon("src/snakegame/apple.png");
        s.setImageApple(ii.getImage());
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        DrawingWindow(g);
    }
    
    public void DrawingWindow(Graphics g) {
        
        if (s.getInGame()) {
            g.drawImage(s.getImageApple(), s.getAppleX(), 
                    s.getAppleY(), this);
        
            for (int i = 0; i < s.getSLength(); i++)
                if (i == 0)
                    g.drawImage(s.getImageHead(), s.getX(i), 
                            s.getY(i), this);
                else
                    g.drawImage(s.getImageBody(), s.getX(i), 
                            s.getY(i), this);
        
            Toolkit.getDefaultToolkit().sync();
        } else {
            GameOver(g);
        }
    }
    
    public void GameOver(Graphics g) {
        String msg = "GAME OVER";
        Font f = new Font("Roboto", Font.BOLD, 20);
        FontMetrics fmetr = getFontMetrics(f);
        
        g.setColor(Color.WHITE);
        g.setFont(f);
        g.drawString(msg, 
                (s.getWindowWidth() - fmetr.stringWidth(msg)) / 2, 
                s.getWindowHeight() / 2);
    }
    
    private int RandomLocate(int x) {
        Random rd = new Random();
        return rd.nextInt(x / 10 - 1) * 10;
    }
    
    public void locateApple() {
        s.setAppleX(RandomLocate(s.getWindowWidth()));
        s.setAppleY(RandomLocate(s.getWindowHeight()));
    }
    
    public void eatApple() {
        if ((s.getX(0) == s.getAppleX()) 
                && (s.getY(0) == s.getAppleY())) {
            s.setSLength(s.getSLength() + 1);
            s.setScore(s.getScore() + 1);
            
            do
                locateApple();
            while(checkCoOrdinate());
        }
    }
    
    private boolean checkCoOrdinate() {
        for (int i = 0; i < s.getSLength(); i++)
            if ((s.getX(i) == s.getAppleX()) 
                    && (s.getY(i) == s.getAppleY()))
                return true;
        return false;
    }

    public void move() {
        for (int i = s.getSLength(); i > 0; i--) {
            s.setX(i, s.getX(i - 1));
            s.setY(i, s.getY(i - 1));
        }
        
        if (s.getLeftDirection())
            s.setX(0, s.getX(0) - s.getImageSize());
        
        if (s.getRightDirection())
            s.setX(0, s.getX(0) + s.getImageSize());
            
        if (s.getUpDirection())
            s.setY(0, s.getY(0) - s.getImageSize());
            
        if (s.getDownDirection())
            s.setY(0, s.getY(0) + s.getImageSize());
    }
    
    public void checkCollision() {
        for (int i = s.getSLength(); i > 3; i--)
            if ((s.getX(0) == s.getX(i)) 
                    && (s.getY(0) == s.getY(i)))
                s.setInGame(false);
        
        if ((s.getX(0) < 0) || (s.getX(0) >= s.getWindowWidth()))
            s.setInGame(false);
        
        if ((s.getY(0) < 0) || (s.getY(0) >= s.getWindowHeight()))
            s.setInGame(false);
        
        if (!s.getInGame())
            s.getTimer().stop();
    }
}
