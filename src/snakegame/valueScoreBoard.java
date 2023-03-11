package snakegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

class valueScoreBoard extends JPanel {
    Settings s;
    Border b;
    
    public valueScoreBoard(Settings s) {
        this.s = s;
        b = BorderFactory.createLineBorder(Color.BLACK);
        
        initValueScoreBoard();
    }
    
    private void initValueScoreBoard() {
        setPreferredSize(new Dimension(240, 20));
        setBorder(b);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        reDrawScore(g);
    }
    
    public void reDrawScore(Graphics g) {
        if (s.getInGame()) {
            Font f = new Font("Roboto", Font.BOLD, 12);
            FontMetrics fmetr = getFontMetrics(f);
            
            g.setColor(Color.BLACK);
            g.setFont(f);
            g.drawString(Integer.toString(s.getScore()), 
                    (getWidth() - fmetr.stringWidth(
                            Integer.toString(s.getScore()))) / 2,
                    getHeight() - 6); // -6 because it's good for visual
            
            Toolkit.getDefaultToolkit().sync();
        }
    }
}
