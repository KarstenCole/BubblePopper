package Bubble;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;

public class BubbleGrid {

    Bubble[][] Grid;
    public int rowsVisible;

    public BubbleGrid(){
        Grid = new Bubble[20][20];
        rowsVisible = 3;

        setGrid();
    }

    public void setGrid(){

        // 20 BY 20 GRID THAT SYMBOLIZES THE COLORS WITH NUMBERS

        int[][] grid = new int[10][20];

        for(int x = 0; x < grid.length-1; x+=2){
            for(int y = 0; y < grid[x].length-3; y+=3){
                int number = (int)(Math.random() * 6) + 1;
                grid[x][y] = number;
                grid[x][y+1] = number;
                grid[x+1][y] = number;

                number = (int)(Math.random() * 6) + 1;
                grid[x][y+2] = number;
                grid[x+1][y+2] = number;
                grid[x+1][y+1] = number;




                /*
                int number = (int)(Math.random() * 6) + 1;
                System.out.println(number);
                grid[x][y] = number;
                //number = (int)(Math.random() * 5) + 1;
                //grid[x][y+1] = number;
                //number = (int)(Math.random() * 5) + 1;
                //grid[x][y+2] = number;
                 */
            }
        }
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[x].length; y++){
                System.out.print(grid[x][y] + " ");
            }
            System.out.println();
        }

        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[0].length; y++){
                if(grid[x][y] == 1) {
                    if(y%2 == 1) {
                        Grid[x][y] = new Bubble("Red", x * 41, y * 38);
                    }
                    else{
                        Grid[x][y] = new Bubble("Red", x * 41 + 20, y * 38);
                    }
                } else if(grid[x][y] == 2){
                    if(y%2 == 1) {
                        Grid[x][y] = new Bubble("Dark Blue", x * 41, y * 38);
                    }
                    else{
                        Grid[x][y] = new Bubble("Dark Blue", x * 41 + 20, y * 38);
                    }
                } else if (grid[x][y] == 3){
                    if(y%2 == 1) {
                        Grid[x][y] = new Bubble("Light Blue", x * 41, y * 38);
                    }
                    else{
                        Grid[x][y] = new Bubble("Light Blue", x * 41 + 20, y * 38);
                    }
                } else if (grid[x][y] == 4){
                    if(y%2 == 1) {
                        Grid[x][y] = new Bubble("Purple", x * 41, y * 38);
                    }
                    else{
                        Grid[x][y] = new Bubble("Purple", x * 41 + 20, y * 38);
                    }
                } else if (grid[x][y] == 5){
                    if(y%2 == 1) {
                        Grid[x][y] = new Bubble("Yellow", x * 41, y * 38);
                    }
                    else{
                        Grid[x][y] = new Bubble("Yellow", x * 41 + 20, y * 38);
                    }
                } else if (grid[x][y] == 6){
                    if(y%2 == 1) {
                        Grid[x][y] = new Bubble("Green", x * 41, y * 38);
                    }
                    else{
                        Grid[x][y] = new Bubble("Green", x * 41 + 20, y * 38);
                    }                 }
            }
        }
    }

    public void drawGrid(Graphics2D g2){
        for(int x = 0; x < Grid.length; x++) {
            for (int y = 0; y < Grid[x].length; y++) {
                if(Grid[x][y] != null) {
                    Grid[x][y].draw(g2);
                }
            }
        }


    }
}
