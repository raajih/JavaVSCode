//Raajih Roland
//Programming project 3
package ProgrammingProject3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.KeyAdapter;  
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Drawer extends JPanel {
    private List<Shape> shapes = new ArrayList<>();//Hold all shapes until they are cleared
    private Shape currentShape;  // Shape object to draw
    private Point startPoint;  // Starting point for the shape
    private String currentShapeType = "Oval"; //Default shape will be oval
    private boolean trailEnabled = false; //See if user wants trail feature to be on
    private Color currentColor = Color.BLUE; // Default shape color

    public Drawer() 
    {
       
    
        MouseAdapter mouseHandler = new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                // Initialize the starting point
                startPoint = e.getPoint();

                //Figure out which shape we are making
                switch (currentShapeType)
                {
                    case "Box":
                        currentShape = new Box(startPoint, startPoint, currentColor);
                        break;
                    case "Oval":
                        currentShape = new Oval(startPoint, startPoint, currentColor);
                        break;
                    case "Line":
                        currentShape = new Line(startPoint, startPoint, currentColor);
                        break;
                }
                repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // Update the end point of the box as the mouse is dragged
                currentShape.setP2(e.getPoint());

                //TESTING THE TRAIL FEATURE ==============================================================================
                if (trailEnabled)
                {
                    Shape trailShape = null;
                    switch (currentShapeType)
                    {
                        case "Box":
                            trailShape = new Box(startPoint, currentShape.getP2(), currentColor);
                            break;
                        case "Oval":
                            trailShape = new Oval(startPoint, currentShape.getP2(), currentColor);
                            break;
                        case "Line":
                            trailShape = new Line(startPoint, currentShape.getP2(), currentColor);
                            break;
                    }
                    shapes.add(trailShape); // Add the new shape to the list
                }
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) 
            {
                // Finalize the shape position when the mouse is released
                currentShape.setP2(e.getPoint());

                shapes.add(currentShape);//Adds the final shape to the list
                currentShape = null;//Reset
                repaint();
            }
        };

        // Add mouse listeners
        this.addMouseListener(mouseHandler);
        this.addMouseMotionListener(mouseHandler);



         // Add a key listener to change shape type
         this.setFocusable(true);  // Make sure the panel can listen for key events

         
         this.addKeyListener(new KeyAdapter() {
             @Override
             public void keyPressed(KeyEvent e) {
                 // Change the shape type based on the key press
                 switch (e.getKeyChar()) {
                    case 'b':  // If 'B' is pressed, set shape to Box
                         currentShapeType = "Box";
                         break;
                    case 'o':  // If 'O' is pressed, set shape to Oval
                         currentShapeType = "Oval";
                         break;
                    case 'l':  // If 'L' is pressed, set shape to Line
                         currentShapeType = "Line";
                         break;
                    case 't': //Toggle trail feature
                         trailEnabled = !trailEnabled; // Toggle the state
                        break;
                    case 'c': // Open color chooser when 'c' is pressed
                        openColorChooser();
                        break;
                    case 'e': // Clear all shapes when 'e' is pressed
                        shapes.clear(); 
                        repaint();
                        break;
                 }
             }
         });
    }

    private void openColorChooser() 
    {
        Color newColor = JColorChooser.showDialog(null, "Choose a Color", currentColor);
        if (newColor != null) 
        {
            currentColor = newColor; // Update current color
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //Draw past shapes
        for (Shape shape: shapes)
        {
            shape.draw(g);
        }



        if (currentShape != null) {
            // Draw the box using its draw method
            currentShape.draw(g);
        }
    }

    //-----------------------MAIN METHOD---------------------------------
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawer");
        frame.setLayout(new BorderLayout());

        Drawer drawer = new Drawer();
        frame.add(drawer, BorderLayout.CENTER);//Put drawings in center

        // Create a panel for the label with FlowLayout
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Center alignment
        JLabel text = new JLabel("(E)rase (T)rail (L)ine (B)ox (O)val (C)olor");
        labelPanel.add(text); // Add the label to the panel

        frame.add(labelPanel, BorderLayout.SOUTH); // Add the panel to the bottom
    
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}