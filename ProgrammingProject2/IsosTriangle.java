//Raajih Roland
//Programming Project 2
package ProgrammingProject2;
import javax.swing.*;
import java.awt.*;

public class IsosTriangle 
{
    /**
    * Paint an isosceles triangle.
    *
    * @param g      the Graphics object to draw on
    * @param x      the x-coordinate of the top point of the triangle
    * @param y      the y-coordinate of the top point of the triangle
    * @param base   the base length of the triangle
    * @param height the height of the triangle
    * @param color  the color of the triangle
    */
   public static void paint(Graphics g, int x, int y, int base, int height, Color color) {
       g.setColor(color);

       // Calculate the three points of the triangle
       int[] xPoints = {x, x + base, x + base / 2};  // x-coordinates of the triangle vertices
       int[] yPoints = {y, y, y - height};           // y-coordinates of the triangle vertices

       // Draw the triangle by filling a polygon with the three points
       g.fillPolygon(xPoints, yPoints, 3);
   }
}


