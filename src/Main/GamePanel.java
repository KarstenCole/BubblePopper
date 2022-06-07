package Main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    final static int PANEL_HEIGHT = 1000;
    final static int PANEL_WIDTH = 800;

    public GamePanel(){

        this.setBounds(0,0,PANEL_WIDTH,PANEL_HEIGHT);
        this.setBackground(Color.BLACK);
    }

}
