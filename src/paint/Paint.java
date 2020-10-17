package paint;

import java.awt.Point;
import java.io.BufferedWriter;

public interface Paint {
	public void draw(GraphicAdapter g); //Main function: Drawn - about objects
	public boolean contains(Point p);	                    // Check whether the point belongs to the object
	public void move(Point startDrag, Point endDrag);	    // Function to move the object
	public void writetoFile(BufferedWriter b);	            // Write the value of the object to a text file
	public void makeObject(Point startDrag, Point endDrag);	// Create object
}