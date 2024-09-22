//Raajih Roland
//Programming Project 2
package ProgrammingProject2;
import javax.swing.*;
import java.awt.*;

public class Door 
{
    public static void paint(Graphics g, int x, int y, int width, int height)
    {
        //Set color of door and make door
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);

        //Make doorknob
        g.setColor(Color.YELLOW);
        // Center the doorknob horizontally and vertically within the door
        g.fillOval(x + (width / 2) - (width / 10 / 2), y + (height / 2) - (width / 10 / 2), width / 10, width / 10);
    }
}
