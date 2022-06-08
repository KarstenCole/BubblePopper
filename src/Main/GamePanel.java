package Main;

import Bubble.BubbleGrid;
import Bubble.ProjBubble;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    final static int PANEL_HEIGHT = 1000;
    final static int PANEL_WIDTH = 800;

    BubbleGrid grid = new BubbleGrid();
    ProjBubble projBubble = new ProjBubble();

    public GamePanel(){

        this.setBounds(0,0,PANEL_WIDTH,PANEL_HEIGHT);
        this.setBackground(Color.BLACK);

    }


    @Override
    public void run() {

    }
}
