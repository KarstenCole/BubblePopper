package Main;

import Bubble.Bubble;
import Bubble.BubbleGrid;
import Bubble.ProjBubble;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    final int FPS = 60;

    public final static int PANEL_HEIGHT = 800;
    public final static int PANEL_WIDTH = 445;

    BubbleGrid grid = new BubbleGrid();
    ProjBubble projBubble = new ProjBubble("Green");

    Thread gameThread;

    public GamePanel(){

        this.setBounds(0,0,PANEL_WIDTH,PANEL_HEIGHT);
        this.setBackground(Color.BLACK);

    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;


        while(gameThread != null){

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            timer += currentTime - lastTime;
            lastTime = currentTime;

            if(delta>=1){
                update();
                repaint();
                delta--;
            }
        }

    }

    public void update(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        grid.drawGrid(g2);

        projBubble.draw(g2);
    }
}
