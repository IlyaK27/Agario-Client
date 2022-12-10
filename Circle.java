import java.util.*;
import java.awt.*;

public class Circle {
    protected int x;
    protected int y;
    protected int radius;
    protected Color color;
    
    public Circle(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }
    public Circle(int radius, Color color) {
        this.x = -1;
        this.y = -1;
        this.radius = radius;
        this.color = color;
    }
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getRadius() {
        return this.radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public Color getColor() {
        return this.color;
    }
    public void draw(Graphics g, Circle otherCircle){
        g.setColor(color);
        g.fillOval((x - otherCircle.getX() - radius) + Const.WIDTH/2, (y - otherCircle.getY() - radius) + Const.HEIGHT/2, radius * 2, radius * 2);
    }
}
