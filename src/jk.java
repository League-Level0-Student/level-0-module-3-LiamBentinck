import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class jk {
	 static Robot rob = new Robot();
	public static void main(String[] args) {
	String jo = JOptionPane.showInputDialog("do you want blue or blue.");
		if(jo.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.BLUE);
		}
		rob.hide();
		
		String bo = JOptionPane.showInputDialog("what shape. square, circle, triangle.");
	   if (bo.equalsIgnoreCase("square")) {
		drawSquare();
	}
	   if (bo.equalsIgnoreCase("triangle")) {
			drawTriangle();
	   }
	   if (bo.equalsIgnoreCase("circle")) {
			drawCircle();
	   }	 
}
static void drawSquare() {
	 rob.penDown();
	 rob.move(100);
	 rob.turn(90);
	 rob.move(100);
	 rob.turn(90);
	 rob.move(100);
	 rob.turn(90);
	 rob.move(100);
	 rob.turn(90);	
}
static void drawTriangle() {
for (int i = 0; i < 3; i++) {
	rob.penDown();
	rob.move(100);
	rob.turn(120);
	
	
}
}
 static void drawCircle() {
	for (int i = 0; i < 360; i++) {
	rob.penDown();	
	rob.move(10);
	rob.turn(10);
	}
}
}

