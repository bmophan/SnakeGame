package snakegame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class EventHandling extends KeyAdapter {
    Settings s;
    public EventHandling(Settings s) {
        this.s = s;
    }
    
    @Override
    public void keyPressed(KeyEvent k) {
        int key = k.getKeyCode();
        
        switch(key) {
            case KeyEvent.VK_LEFT -> {
                if(!s.getRightDirection()) {
                    s.setLeftDirection(true);
                    s.setUpDirection(false);
                    s.setDownDirection(false);
                }
            }
            case KeyEvent.VK_RIGHT -> {
                if(!s.getLeftDirection()) {
                    s.setRightDirection(true);
                    s.setUpDirection(false);
                    s.setDownDirection(false);
                }
            }
            case KeyEvent.VK_UP -> {
                if(!s.getDownDirection()) {
                    s.setLeftDirection(false);
                    s.setRightDirection(false);
                    s.setUpDirection(true);
                }
            }
            case KeyEvent.VK_DOWN -> {
                if(!s.getUpDirection()) {
                    s.setLeftDirection(false);
                    s.setRightDirection(false);
                    s.setDownDirection(true);
                }
            }
        }
    }
}
