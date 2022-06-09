package Bubble;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Bubble{

    final static int WIDTH = 40;
    final static int HEIGHT = 40;

    int X;
    int Y;

    String color;

    BufferedImage bubble;


    public Bubble(String color, int x, int y){

        X = x;
        Y = y;

        this.color = color;
        setImage(color);
    }

    public void draw(Graphics2D g2){
        g2.drawImage(bubble,X,Y,WIDTH,HEIGHT,null);
    }

    public void setImage(String color){
        if (color.equals("Green")) {
            try {
                bubble = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Bubbles/Green.png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (color.equals("Light Blue")) {
            try {
                bubble = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Bubbles/LightBlue.png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (color.equals("Yellow")) {
            try {
                bubble = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Bubbles/Yellow.png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (color.equals("Red")) {
            try {
                bubble = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Bubbles/Red.png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (color.equals("Dark Blue")) {
            try {
                bubble = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Bubbles/DarkBlue.png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (color.equals("Purple")) {
            try {
                bubble = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Bubbles/Purple.png")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
