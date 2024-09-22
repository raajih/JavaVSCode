//Raajih Roland
//Programming Project 2
package ProgrammingProject2;

import javax.swing.*;
import java.awt.*;

public class HouseWithScenery extends JPanel {

    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set background color (optional, for visibility)
        this.setBackground(Color.WHITE);

        // Test the Roof by drawing it at specific coordinates
        Picture.paint(g, 150, 100, 100, 80);  // x, y, base, height, color
    }

    public static void main(String[] args) {
        // Create a frame to hold the panel
        JFrame frame = new JFrame("Programming Project 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);  // Set the size of the frame
        frame.add(new HouseWithScenery());  // Add the panel to the frame
        frame.setVisible(true);  // Make the frame visible
    }
}