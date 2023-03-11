package snakegame;

import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.Timer;

class Settings {
    private final int W_WIDTH;
    private final int W_HEIGHT;
    private final int IMAGE_SIZE;
    private final int LENGTH_MAX;
    
    private final int[] x;
    private final int[] y;
    
    private int score;
    private int sSpeed;
    private int sLength;
    private int apple_x;
    private int apple_y;
    
    private boolean leftDirect;
    private boolean rightDirect;
    private boolean upDirect;
    private boolean downDirect;
    private boolean inGame;
    
    private Timer timer;
    private Image imageHead;
    private Image imageBody;
    private Image imageApple;
    
    public Settings() {
        W_WIDTH = 300;
        W_HEIGHT = 300;
        
        IMAGE_SIZE = 10;
        LENGTH_MAX = (int)((W_WIDTH * W_HEIGHT) / IMAGE_SIZE);
        
        x = new int[LENGTH_MAX];
        y = new int[LENGTH_MAX];
    }
    
    public int getWindowWidth() {
        return W_WIDTH;
    }
    
    public int getWindowHeight() {
        return W_HEIGHT;
    }
    
    public int getImageSize() {
        return IMAGE_SIZE;
    }
    
    public int getLengthMax() {
        return LENGTH_MAX;
    }
    
    public int getX(int pos) {
        return x[pos];
    }
    public void setX(int pos, int x) {
        this.x[pos] = x;
    }
    
    public int getY(int pos) {
        return y[pos];
    }
    public void setY(int pos, int y) {
        this.y[pos] = y;
    }
    
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getSSpeed() {
        return sSpeed;
    }
    public void setSSpeed(int sSpeed) {
        this.sSpeed = sSpeed;
    }
    
    public int getSLength() {
        return sLength;
    }
    public void setSLength(int sLength) {
        this.sLength = sLength;
    }
    
    public int getAppleX() {
        return apple_x;
    }
    public void setAppleX(int apple_x) {
        this.apple_x = apple_x;
    }
    
    public int getAppleY() {
        return apple_y;
    }
    public void setAppleY(int apple_y) {
        this.apple_y = apple_y;
    }
    
    public boolean getLeftDirection() {
        return leftDirect;
    }
    public void setLeftDirection(boolean leftDirect) {
        this.leftDirect = leftDirect;
    }
    
    public boolean getRightDirection() {
        return rightDirect;
    }
    public void setRightDirection(boolean rightDirect) {
        this.rightDirect = rightDirect;
    }
    
    public boolean getUpDirection() {
        return upDirect;
    }
    public void setUpDirection(boolean upDirect) {
        this.upDirect = upDirect;
    }
    
    public boolean getDownDirection() {
        return downDirect;
    }
    public void setDownDirection(boolean downDirect) {
        this.downDirect = downDirect;
    }
    
    public boolean getInGame() {
        return inGame;
    }
    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }
    
    public Timer getTimer() {
        return timer;
    }
    public void setTimer(Timer timer) {
        this.timer = timer;
    }
    
    public Image getImageHead() {
        return imageHead;
    }
    public void setImageHead(Image imageHead) {
        this.imageHead = imageHead;
    }
    
    public Image getImageBody() {
        return imageBody;
    }
    public void setImageBody(Image imageBody) {
        this.imageBody = imageBody;
    }
    
    public Image getImageApple() {
        return imageApple;
    }
    public void setImageApple(Image imageApple) {
        this.imageApple = imageApple;
    }
}
