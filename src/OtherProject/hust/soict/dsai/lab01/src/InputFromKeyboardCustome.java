package OtherProject.hust.soict.dsai.lab01.src;

import javax.swing.JOptionPane;
public class InputFromKeyboardCustome {
	public static void main(String[] args) {
		String[] choice = {"I do", "I don't"};
		int option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
		JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION?"I do":"I don't"));
		System.exit(0);
	}
}