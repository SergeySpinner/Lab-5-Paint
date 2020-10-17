package paint;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
//лдрдлорлорл
@SuppressWarnings("serial")
public class About extends JFrame {
	private JPanel contentPane;
	public About() {
		setTitle("About");
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JEditorPane About = new JEditorPane();
		About.setEditable(false);
		About.setText("About Application:\r\nDesign by ME\r\nMSSV: 1111514\r\nClass: 11TTH\nDate: 05 - 05 - 2016");
		contentPane.add(About, BorderLayout.CENTER);

		//в PaintSurface.java

		//if (shapeType == DrawShape.SHAPE_RECTANGLE)
		//{ shape = new Rectangle(); }
		//else if (shapeType == DrawShape.SHAPE_ROUNDED_RECT)
		//{ shape = new RoundedRectangle(); }
		//else if(shapeType == DrawShape.SHAPE_ELLIPSE)
		//{ shape = new Ellipse(); }
		//else { return; }

		//в DrawFrame.java

		//BigTextButton ellipse = new BigTextButton("Ellipse");
		//ellipse.addActionListener(e->{ surface.setShapeType(DrawShape.SHAPE_ELLIPSE); }); buttonPanel.add(ellipse); BigTextButton clear = new BigTextButton("Clear"); clear.addActionListener(e->{ surface.clear(); }); buttonPanel.add(clear);

		//в Ellipse.java
		//
		//public class Ellipse extends DrawShape { public Ellipse() { } public Ellipse(Point startPoint, Point endPoint) { super(startPoint, endPoint); } @Override public Shape getShape(Point startPoint, Point endPoint) { return new Ellipse2D.Double(Math.min(startPoint.getX(), endPoint.getX()), Math.min(startPoint.getY(), endPoint.getY()), Math.abs(startPoint.getX() - endPoint.getX()), Math.abs(startPoint.getY() - endPoint.getY())); } }
	}

}
