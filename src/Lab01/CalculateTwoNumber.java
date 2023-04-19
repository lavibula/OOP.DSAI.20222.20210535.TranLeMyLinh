package Lab01;
import javax.swing.JOptionPane;
public class CalculateTwoNumber {
	public static void main(String[] args) {
		double num1, num2;
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter first number:"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter second number:"));
		double sum = num1 + num2;
		JOptionPane.showMessageDialog(null, "Sum of 2 numbers: " + sum);
		double diff = num1-num2;
		JOptionPane.showMessageDialog(null, "Difference of 2 numbers: " + diff);
		double product = num1 * num2;
		JOptionPane.showMessageDialog(null, "Product of 2 numbers: " + product);
		double quotient = num1/num2;
		JOptionPane.showMessageDialog(null, "Quoient of 2 numbers: " + quotient);
		System.exit(0);
	}
	
}
