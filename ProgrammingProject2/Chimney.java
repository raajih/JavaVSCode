//Raajih Roland
//Programming Project 2
package ProgrammingProject2;

import javax.swing.*;
import java.awt.*;

public class Chimney {

    /**
     * Paint the chimney with puffs of smoke.
     *
     * @param g          the Graphics object to draw on
     * @param x          the x-coordinate of the chimney base
     * @param y          the y-coordinate of the chimney base
     * @param houseWidth the width of the house
     * @param height     the height of the chimney
     * @param smokeColor the color of the smoke
     */
    public static void paint(Graphics g, int x, int y, int width, int height, Color smokeColor) {
        
        
        // Draw the chimney
        int chimneyY = y - 20;
        g.setColor(Color.GRAY);
        g.fillRect(x + (width / 10), chimneyY, width / 10, height / 5); // Centered chimney

        

        // Positions for smoke puffs
         // Draw smoke puffs
         int puffSize = width / 6;
         int puffSpacing = 10; // Vertical spacing between puffs
 
         // Positions for smoke puffs
         int puffX = x + (width / 10); // X-coordinate for all puffs
         int puffY = chimneyY - puffSize; // Start just above the chimney
 
         g.setColor(smokeColor);
         for (int i = 0; i < 3; i++) {
             g.fillOval(puffX - puffSize / 2, puffY - i * puffSpacing - puffSize / 2, puffSize, puffSize);
         }
    }
}