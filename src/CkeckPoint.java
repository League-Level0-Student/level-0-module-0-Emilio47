import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CkeckPoint {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("What is your favorite color");
	JOptionPane.showMessageDialog(null, color + " is my favorite color too");
	Robot Bot = new Robot();
	Bot.penDown();
	Bot.turn(120);
	Bot.move(120);
	Bot.turn(120);
	Bot.move(120);
	Bot.turn(120);
	Bot.move(120);
	
}
}