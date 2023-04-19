
import java.util.Scanner;
public class EquationFirstDegree {
    
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter number a:");
        double a = keyboard.nextDouble();
        System.out.println("Enter number b:");
        double b = keyboard.nextDouble();

        if(b==0) {
            System.out.println("The equation has infinitely many roots!");                
        }
        else {
            if(a==0) {
                System.out.println("The equation has no solution!");
            }
            else {
                double x = -b/a; 
                System.out.println("The equation has a root x = " + x);
            }
        }
    }
}
