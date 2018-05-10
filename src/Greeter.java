import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String grape = JOptionPane.showInputDialog("Whats your name?");
	String four = JOptionPane.showInputDialog("Hey " + grape + " Whats your last name?");
	JOptionPane.showMessageDialog(null, "Hey "+grape+" "+four);
}
}
