package Main;

import javax.swing.*;

public class Runner {
    public static void main(String[] args){

        ImageIcon icon = new ImageIcon("BlueBubble.png");

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(855,900);
        window.setResizable(false);
        window.setTitle("Bubble Popper");
        window.setIconImage(icon.getImage());

        GamePanel panel = new GamePanel();

        window.add(panel);
        window.setVisible(true);

        //starts GameThread
        panel.startGameThread();
    }
}
