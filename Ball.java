import java.util.*;
import java.awt.*; 

public class Ball extends Circle{
    private String name;
    // todo: implement ball growth
    
    public Ball(String name, int radius, Color color){
        super(radius, color);
        this.name = name;
        //this.alive = true;
    }
    public void draw(Graphics g, Circle otherCircle){
        super.draw(g, otherCircle);
        g.setColor(Const.FONT_COLOR);
        g.setFont(Const.BALL_FONT);
        g.drawString(name, x, y);
    }
    private int diameter() {
        return this.radius * 2;
    }
}
