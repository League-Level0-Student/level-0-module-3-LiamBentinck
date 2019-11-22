//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		 Robot rob = new Robot();
				 
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 8; i++) {
			
		
		 String rad = JOptionPane.showInputDialog("what color do you want?Red, blue, or green?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(rad.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.GREEN);
		}
		else if(rad.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}
		else if(rad.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.BLUE);
			
		}
        //6. If the user doesn’t enter anything, choose a random color
		else {
			rob.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.setSpeed(1000);
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
	}
	private static void penWidth() {
		// TODO Auto-generated method stub
		
	}
}
