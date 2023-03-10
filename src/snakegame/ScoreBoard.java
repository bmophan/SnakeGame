package snakegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ScoreBoard extends JPanel implements ActionListener {
    Settings s;
    JPanel name;
    JPanel value;
    JLabel label;
    
    public ScoreBoard(Settings s) {
        this.s = s;
        
        initScoreBoard();
    }
    
    private void initScoreBoard() {
        setBackground(Color.WHITE);
        setFocusable(false);
        setPreferredSize(new Dimension(s.getWindowWidth(), 40));
        
        name = new JPanel();
        name.add(new JLabel("Score: "));
        name.setPreferredSize(new Dimension(45, 25));
        
        value = new JPanel();
        value.setPreferredSize(new Dimension(240, 25));
        label = new JLabel(Integer.toString(s.getScore()));
        value.add(label);
        
        add(name);
        add(value);
    }
    
    private void changeScore() {
        value.remove(label);
        label = new JLabel(Integer.toString(s.getScore()));
        value.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (s.getInGame()) {
            changeScore();
        }
        repaint();
    }
    
    
}
