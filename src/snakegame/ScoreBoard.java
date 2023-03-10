package snakegame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ScoreBoard extends JPanel {
    Settings s;
    
    public ScoreBoard(Settings s) {
        this.s = s;
        
        initScoreBoard();
    }
    
    private void initScoreBoard() {
        setBackground(Color.WHITE);
        setFocusable(false);
        setPreferredSize(new Dimension(s.getWindowWidth(), 40));
        
        JPanel name = new JPanel();
        name.add(new JLabel("Score: "));
        name.setPreferredSize(new Dimension(45, 25));
        
        JPanel value = new JPanel();
        value.add(new JLabel("0"));
        value.setPreferredSize(new Dimension(240, 25));
        
        add(name);
        add(value);
    }
}
