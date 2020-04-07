// Daniel Carpenter
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.lang.Object;

public class Project_11 extends JPanel
{
	// STATIC CONSTANTS ----------------------------------------------------------------------------------------------------
		private static final int WIDTH = 640;
		private static final int HEIGHT = 360;
		private static final String WINDOW_TITLE = "Project 11: Image Output for Java Art";
		
		// LIST OF COLORS
			Color red 		= new Color(96, 45, 45);
			Color blue 		= new Color(38, 66, 96);
			Color green		= new Color(33, 73, 62);
			Color yellow 	= new Color(169, 123, 25);
			Color purple	= new Color(86, 59, 93);
			Color orange	= new Color(255, 170, 128);
			Color pacMan	= new Color(255,238,0);
	
		
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
				
			// CREATE 2-LINES ----------------------------------------------------------------------------------------------
				// HORIZONTAL LINE
					Line2D.Double line = new Line2D.Double(0, HEIGHT/2, WIDTH, HEIGHT/2);
					g2d.setColor(Color.BLUE);
					g2d.draw(line);
				
				// VERTICAL LINE
					line.setLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
					g2d.setColor(Color.RED);
					g2d.draw(line);
				
			// CREATE PAC MAN ----------------------------------------------------------------------------------------------
				// DEFINE INPUTS
					double x 		= WIDTH / 20;
					double y 		= HEIGHT / 4.5;
					double w 		= 200;
					double h		= 200;
					double angSt 	= 35;
					double angExt	= 305;
					int  closure	= Arc2D.PIE;
					
					final float dash1[] = {10.0f};
					BasicStroke dashed = new BasicStroke(1.0f,
	                        BasicStroke.CAP_BUTT,
	                        BasicStroke.JOIN_MITER,
	                        10.0f, dash1, 0.0f);
					
				// DRAW PAC MAN
					Arc2D.Double arc = new Arc2D.Double(x, y, w, h, angSt, angExt, closure);
					g2d.setPaint(pacMan);
					g2d.setStroke(dashed);
					g2d.draw(arc);
					g2d.fill (arc);
					
			// CREATE GHOST -------------------------------------------------------------------------------------------------

		}
}
