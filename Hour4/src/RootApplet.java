import java.awt.*;

public class RootApplet extends javax.swing.JApplet {
	//declare variables here
	int number;
	
	//initialize all variables here
	public void init() {
		number = 225;
	}
	
	// Controls how the UI is displayed by drawing it out
	public void paint(Graphics screen) {
		Graphics2D screen2D = (Graphics2D) screen;
		screen2D.drawString("The square root of " +
				number +
				" is " +
				Math.sqrt(number), 5, 50);
	}
}