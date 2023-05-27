
import javax.swing.JOptionPane;
public class Show2Number{
	public static void main(String[] args) {
		String strNum1;
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ");
	
		String strNum2;
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ");
		
		JOptionPane.showMessageDialog(null, "Show two numbers: " + strNum1 + " and " + strNum2);
		System.exit(0);
	}
}