package Lab01;

import java.lang.Math;
import java.util.Scanner;


public class EquationSecondDegree {
    
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number a:");
        double a = keyboard.nextDouble();
        System.out.println("Enter number b:");
        double b = keyboard.nextDouble();
        System.out.println("Enter number c:");
        double c = keyboard.nextDouble();

        double delta = b*b - 4*a*c;
        double x1=(-b+Math.sqrt(delta))/(2*a);
        double x2=(-b-Math.sqrt(delta))/(2*a);
        

        if(a==0) {
            if(c==0) {
                System.out.println("The equation has infinitely many roots!");
            }
            else {
                if(b==0) {
                    System.out.println("The equation has no solution!");
                }
                else {
                    double x = -c/b; 
                    System.out.println("The equation has a root x = " + x);
                }
            }
        }
        else {
            if(delta<0) {
                System.out.println("The equation has no solution!");
            }
            if(delta==0) {
                System.out.println("The equation has a double roots: x1= x2 = " + -b/(2*a));
            }
            else {
                System.out.println("The euqation has 2 distinct roots: x1=" + x1 + ", x2=" + x2);
            }
        } 
    }
}