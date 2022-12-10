import java.util.*;
import java.awt.*; 

public class Ball extends Circle{
    public String name;
    // todo: implement ball growth
    
    public Ball(String name, int radius, Color color){
        super(radius, color);
        this.name = name; 
    }
    public Ball(String name, int x, int y, int radius, Color color){
        super(x, y, radius, color);
        this.name = name;
    }
    public void draw(Graphics g, Circle otherCircle){
        int drawX = (x - otherCircle.getX() - radius) + Const.WIDTH/2;
        int drawY = (y - otherCircle.getY() - radius) + Const.HEIGHT/2;
        super.draw(g, otherCircle, drawX, drawY);
        g.setColor(Const.FONT_COLOR);
        g.setFont(Const.BALL_FONT);
        g.drawString(name, drawX, drawY);
    }
    private int diameter() {
        return this.radius * 2;
    }
}
