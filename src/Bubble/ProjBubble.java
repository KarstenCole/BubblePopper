package Bubble;

import Main.GamePanel;

public class ProjBubble extends Bubble{
    final static int WIDTH = 40;
    final static int HEIGHT = 40;



    public ProjBubble(String color){
        super( color, GamePanel.PANEL_WIDTH/2-WIDTH/2,  GamePanel.PANEL_HEIGHT-HEIGHT-40);
        super.setImage(color);
    }

    public void checkIntersections(){



    }
}
