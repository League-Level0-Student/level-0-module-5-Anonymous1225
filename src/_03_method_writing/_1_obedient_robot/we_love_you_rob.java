package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class we_love_you_rob {
	public static void main(String[] args) {
		String shape= JOptionPane.showInputDialog("Name a shape");
		if (shape.equals("circle") ||shape.equals("Circle")) {
			drawcircle();
	}
		if (shape.equals("square")||shape.equals("Square")) {
			drawsquare();
		}
		
	}

	public static void drawcircle() {
		Robot rob = new Robot();
		rob.setSpeed(2000);
		rob.penDown();
		for (int i = 0; i < 360; i++) {
			rob.turn(1);
			rob.move(1);
		}
		rob.hide();
	}
	public static void drawsquare() {
		Robot rob = new Robot();
		rob.setSpeed(2000);
		rob.penDown();
		for (int i =0; i<4; i++) {
			rob.turn(90);
			rob.move(120);
		}
	}
}