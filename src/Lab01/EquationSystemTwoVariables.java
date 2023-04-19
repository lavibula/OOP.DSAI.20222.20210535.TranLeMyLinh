package Lab01;
import java.util.Scanner;
public class EquationSystemTwoVariables {
    
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Your equation systems has form: a11x1 + a12x2 = b1 & a21x1 + a22x2 = b2:");
        System.out.println("Enter number a11:");
        double a11 = keyboard.nextDouble();
        System.out.println("Enter number a12:");
        double a12 = keyboard.nextDouble();
        System.out.println("Enter number b1:");
        double b1 = keyboard.nextDouble();
        System.out.println("Enter number a21:");
        double a21 = keyboard.nextDouble();
        System.out.println("Enter number a22:");
        double a22 = keyboard.nextDouble();
        System.out.println("Enter number b2:");
        double b2 = keyboard.nextDouble();
        
        double D = a11 * a22 - a21 * a12;
        double Dx = b1 * a22 - b2 * a12;
        double Dy = a11 * b2 - a21 * b1;
        double epsilon = 0.0001;
        if(Math.abs(D) < epsilon && Math.abs(Dx) < epsilon && Math.abs(Dy) < epsilon) {
            System.out.println("The equation has infinitely many roots!");                
        }
        else {
            if(Math.abs(D) < epsilon && (Math.abs(Dx) > epsilon || Math.abs(Dy) > epsilon)) {
                System.out.println("The equation has no solution!");
            }
            else {
                double x = Dx/D;
                double y = Dy/D;
                System.out.println("The equation has a root (x,y) = (" + x + "," + y + ")");
            }
        }
    }
}
