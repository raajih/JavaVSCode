//Raajih Roland
//Programming Project 2
package ProgrammingProject2;
import javax.swing.*;
import java.awt.*;

public class Picture 
{
    public static void paint(Graphics g, int x, int y, int width, int height) {
        // Paint scenery
        Scenery.paint(g, x, y, width, height);
        // Paint house
        House.paint(g, x, y, width, height);
        g.drawString("Raajih Roland!!", 20, 20);
    }    
}
