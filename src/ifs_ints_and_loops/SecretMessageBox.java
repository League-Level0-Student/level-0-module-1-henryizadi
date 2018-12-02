package ifs_ints_and_loops;
import javax.swing.JOptionPane;

public class secretmessagebox {
	public static void main(String[] args) {
		
	
String password="1";
String message=JOptionPane.showInputDialog("what is the secret message");
String blah=JOptionPane.showInputDialog("what is the password");
if (blah.equals(password)) {
JOptionPane.showMessageDialog(null,"the secret message is"+ message);
}else {
	JOptionPane.showMessageDialog(null,"INTRUDER!!!!!!!");
}

	}
}
