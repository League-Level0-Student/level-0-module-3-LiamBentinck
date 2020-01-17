import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class robotthat {
	static Robot rob = new Robot();
	public static void main(String[] args) {
	String ko = JOptionPane.showInputDialog("what color. BLUE or blue. (or red or RED)");
		if (ko.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.blue);
		}
		if (ko.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}
		
		
		String jo = JOptionPane.showInputDialog("what shape? Circle, square, triangle?");	
	if (jo.equalsIgnoreCase("circle")) {
		 drawCircle();
	}
	if (jo.equalsIgnoreCase("square")) {
		drawSquare();
	}
	if (jo.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	
	
	
	
	
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.penDown();
			rob.move(100);
			rob.turn(90);
		}
		
	}

static void drawTriangle() {
	for (int i = 0; i < 3; i++) {
		rob.penDown();
		rob.move(100);
		rob.turn(120);
	
	}
}
static void drawCircle() {
	for (int i = 0; i < 36; i++) {
		rob.penDown();
		rob.move(10);
		rob.turn(10);
			
		
	
}
}
}
