//Raajih Roland
//Programming Project 2
package ProgrammingProject2;

import java.awt.Color;
import java.awt.Graphics;

public class Roof {

    /**
     * Paints the roof using the IsosTriangle class.
     *
     * @param g      the Graphics object to draw on
     * @param x      the x-coordinate of the top of the roof
     * @param y      the y-coordinate of the top of the roof
     * @param base   the base length of the roof (usually the width of the house)
     * @param height the height of the roof (how tall you want the triangle to be)
     */
    public static void paint(Graphics g, int x, int y, int base, int height, Color color) {
        // Paint the roof using IsosTriangle
        IsosTriangle.paint(g, x, y, base, height, color);  // Color of roof can be changed
    }
}