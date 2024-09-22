//Raajih Roland
//Programming Project 2
package ProgrammingProject2;
import javax.swing.*;
import java.awt.*;

public class Window {
    public static void paint(Graphics g, int x, int y, int width, int height)
    {
        g.setColor(Color.GRAY);
        
        int windowWidth = width / 8;
        int windowHeight = height / 4;

        g.fillRect(x + (width / 6), y + (height / 10), windowWidth, windowHeight);
        g.fillRect(x + (width / 6), y + (height / 2), windowWidth, windowHeight);

        
        g.fillRect(x + (width - 30), y + (height / 10), windowWidth, windowHeight);
        g.fillRect(x + (width - 30), y + (height / 2), windowWidth, windowHeight);

        g.fillOval(x + (width / 2) - 7, y + (height / 2) - 25, width / 8, width / 8);
    }
}
