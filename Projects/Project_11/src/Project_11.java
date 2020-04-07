// Daniel Carpenter
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Project_11 extends JPanel
{
	// STATIC CONSTANTS ----------------------------------------------------------------------------------------------------
		private static final int WIDTH = 640;
		private static final int HEIGHT = 480;
		private static final String WINDOW_TITLE = "My Image Title!";
	
		
	// MAIN METHOD  --------------------------------------------------------------------------------------------------------
		public static void main(String[] args)
		{
			JPanel panel = new Project_11();
			panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
			
			JFrame frame = new JFrame(WINDOW_TITLE);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.add(panel);
			frame.pack();
		}

	
	// CREATE PICTURE  -----------------------------------------------------------------------------------------------------	
		public void paintComponent(Graphics g)
	{
		// Do not change these two lines.
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		// Draw a horizontal, blue line in the middle of the screen.
		Line2D.Double line = new Line2D.Double(0, HEIGHT/2, WIDTH, HEIGHT/2);
		g2d.setColor(Color.BLACK);
		g2d.draw(line);
		
		// VERTICAL
		line.setLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
		g2d.setColor(Color.ORANGE);
		g2d.draw(line);
	}
}
