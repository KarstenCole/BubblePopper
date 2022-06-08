package Bubble;

import java.awt.*;

public class Bubble extends Rectangle {

    final static int WIDTH = 50;
    final static int HEIGHT = 50;


    public Bubble(int x, int y){
        super(x, y);
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.drawOval(x, y, width, height);
    }
}
