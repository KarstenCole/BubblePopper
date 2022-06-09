package Bubble;

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

        int[][] grid = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

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
