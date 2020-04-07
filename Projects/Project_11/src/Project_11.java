// Daniel Carpenter
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Project_11 extends JPanel
{
	// STATIC CONSTANTS ----------------------------------------------------------------------------------------------------
		private static final int WIDTH = 640;
		private static final int HEIGHT = 360;
		private static final String WINDOW_TITLE = "Project 11: Image Output for Java Art";
	
		
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
			// LIST OF COLORS
				Color red 		= new Color(96, 45, 45);
				Color blue 		= new Color(38, 66, 96);
				Color green		= new Color(33, 73, 62);
				Color yellow 	= new Color(169, 123, 25);
				Color purple	= new Color(86, 59, 93);
				Color orange	= new Color(255, 170, 128);
			
			// Do not change these two lines.
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
			
			// HORIZONTAL LINE
				Line2D.Double line = new Line2D.Double(0, HEIGHT/2, WIDTH, HEIGHT/2);
				g2d.setColor(purple);
				g2d.draw(line);
			
			// VERTICAL LINE
				line.setLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
				g2d.setColor(green);
				g2d.draw(line);
		}
}
