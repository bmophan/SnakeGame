package snakegame;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ScoreBoard extends JPanel {
    Settings s;
    JPanel name;
    JPanel value;
    
    public ScoreBoard(Settings s) {
        this.s = s;
        setBackground(Color.red);
        initScoreBoard();
    }
    
    private void initScoreBoard() {
        add(scoreBoardPanel());
    }
    
    private JPanel namePanel() {
        JPanel panel = new JPanel();
        
        panel.add(new JLabel("Score:"));
        
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
