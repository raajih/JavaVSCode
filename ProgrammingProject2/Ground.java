//Raajih Roland
//Programming Project 2
package ProgrammingProject2;
import javax.swing.*;
import java.awt.*;

public class Ground {
    public static void paint(Graphics g, int x, int y,int width, int height, Color color)
    {
        g.setColor(color);
        g.fillRect(0, height + y, width * 20, height * 20);
    }
}
