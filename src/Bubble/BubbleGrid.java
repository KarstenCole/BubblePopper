package Bubble;

import java.awt.*;

public class BubbleGrid {

    Bubble[][] Grid;
    int rowsVisible;

    public BubbleGrid(){
        Grid = new Bubble[20][16];
        rowsVisible = 3;
    }

    public void drawGrid(Graphics g){

  /*
        for (int i = 0; i < rowsVisible; i++){
            for (int k = 0; k < Grid[i].length; k++){
                if (Grid[i][k] != null){
                    Grid[i][k].draw(g);
                }
            }
        }
        */

    }
}
