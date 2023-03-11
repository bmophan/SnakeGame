package snakegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

class ScoreBoard extends JPanel {
    Settings s;
    JPanel name;
    JPanel value;
    Border b;
    
    public ScoreBoard(Settings s) {
        this.s = s;
        
        setBackground(Color.WHITE);
        
        initScoreBoard();
    }
    
    private void initScoreBoard() {
        add(scoreBoardPanel());
    }
    
    private JPanel namePanel() {
        JPanel panel = new JPanel();
        
        panel.add(new JLabel("Score:"));
        panel.setPreferredSize(new Dimension(50, 25));
        
        return panel;
    }
    
    private JPanel valuePanel() {
        JPanel panel = new JPanel();
        panel.add(new valueScoreBoard(s));
        
        return panel;
    }
    
    private JPanel scoreBoardPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        
        name = namePanel();
        
        value = valuePanel();
        
        panel.add(name);
        
        panel.add(value);
        
        return panel;
    }
    
    
}
