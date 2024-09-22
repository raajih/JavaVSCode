//Raajih Roland
//Programming Project 2
package ProgrammingProject2;
import javax.swing.*;
import java.awt.*;

public class House 
{
    public static void paint(Graphics g, int x, int y, int width, int height) 
    {
        
        // Draw the house body (a rectangle)
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, width, height); // x, y, width, height
            
        // Draw the roof using IsosTriangle
        Roof.paint(g, x, y, width, (height / 4), Color.RED);//Triangle starts in the upper left of the house rectange. Base is the width of house

        // Center the door at the bottom of the house
        int doorWidth = width / 6;
        int doorHeight = height / 3;

        // Calculate the x coordinate for the door to center it
        int doorX = x + (width - doorWidth) / 2;
        // The y coordinate should be the bottom of the house minus the height of the door
        int doorY = y + height - doorHeight;

        // Draw the door
        Door.paint(g, doorX, doorY, doorWidth, doorHeight);

        // Draw the chimney on the roof
        Chimney.paint(g, x, y, width, height, Color.GRAY);
        Window.paint(g, x, y, width, height);

        
    }
}
    

