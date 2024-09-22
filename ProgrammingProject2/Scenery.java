//Raajih Roland
//Programming Project 2
package ProgrammingProject2;
import javax.swing.*;
import java.awt.*;

public class Scenery 
{
    public static void paint(Graphics g, int x, int y, int width, int height) {
        Sky.paint(g, x, y, width, height, Color.BLUE);
        Ground.paint(g, x, y, width, height, Color.GREEN);
    }
}