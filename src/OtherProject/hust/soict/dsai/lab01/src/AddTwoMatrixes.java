package OtherProject.hust.soict.dsai.lab01.src;

import java.util.Scanner;

public class AddTwoMatrixes {
    
    static Scanner keyboard = new Scanner(System.in);
    static void Input(int a[][], int m, int n, char b) {
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(b +"[" + (i+1) + "][" + (j+1) + "] = ");
                a[i][j] = keyboard.nextInt();
            }
        }
    }

    static void Output(int a[][], int m, int n) {
        System.out.println("Your result:");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int row, column;

        System.out.print("Enter rows of matrix: ");
        row = keyboard.nextInt();
        System.out.print("Enter columns of matrix: ");
        column = keyboard.nextInt();

        int first[][] = new int[row][column];
        int second[][] = new int[row][column];
        int sum[][] = new int[row][column];

        Input(first, row, column, 'a');
        Input(second, row, column, 'b');

        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }

        Output(sum, row, column); 
    }
}