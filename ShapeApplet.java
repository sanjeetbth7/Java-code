
import java.applet.Applet;
import java.awt.Graphics;

public class ShapeApplet extends Applet {

    public void paint(Graphics g) {
        // Draw a circle
        g.drawOval(50, 50, 100, 100);

        // Draw a triangle
        int[] xPoints = {200, 250, 300};
        int[] yPoints = {200, 100, 200};
        int nPoints = 3;
        g.drawPolygon(xPoints, yPoints, nPoints);
    }
}
