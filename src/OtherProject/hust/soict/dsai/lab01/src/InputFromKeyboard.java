package OtherProject.hust.soict.dsai.lab01.src; /** import java.util.Scanner;
public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your name?");
		String strName = keyboard.nextLine();
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt();
		System.out.println("How tall are you (m)?");
		double dHeight = keyboard.nextDouble();
		System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. " + "Your height is " + dHeight + ".");
		
		}

}
*/

import java.io.*;
import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        try {
        	File file = new File("answer.txt");
            FileWriter fw = new FileWriter(file,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("------------------------ 6.2 ------------------------");
            Scanner keyboard = new Scanner(System.in);
            System.out.println("What's your name?");
            String strName = keyboard.nextLine();
            pw.println("What's your name?");
            pw.println(strName);

            System.out.println("How old are you?");
            int iAge = keyboard.nextInt();
            pw.println("How old are you?");
            pw.println(iAge);

            System.out.println("How tall are you (m)?");
            double dHeight = keyboard.nextDouble();
            pw.println("How tall are you (m)?");
            pw.println(dHeight);

            System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. " + "Your height is " + dHeight + ".");
            pw.println("Mrs/Ms. " + strName + ", " + iAge + " years old. " + "Your height is " + dHeight + ".");

            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

