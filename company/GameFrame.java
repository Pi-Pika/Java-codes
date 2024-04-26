package com.company;

import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        GamePanel panel  = new GamePanel();
        this.add(panel);
        this.setTitle("Snake Master"); //Application name
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
