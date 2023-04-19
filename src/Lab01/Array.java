package Lab01;
import java.util.Scanner;
public class Array {
    
    static Scanner keyboard = new Scanner(System.in);

    static void Sorting(int a[], int n) {
        int max = 0;
        for (int i=0; i<n; i++) {
            for (int j= i+1; j<n; j++) {
                if (a[i] > a[j]) {
                    max = a[i];
                    a[i] = a[j];
                    a[j] = max;
                }
            }
        }
    }

    static void SumAndAverage(int a[], int n) {
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += a[i];
        }
        double avg = (double)sum/n;
        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + avg);
    }

    static void output(int a[], int n) {
        System.out.println("Sorting:");
        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        System.out.print("Matrix size (nxm): ");
        int n = keyboard.nextInt();
        int array[] = new int[n];
        for (int i = 0; i<n; i++) {
            array[i] = keyboard.nextInt();
        }
        
        SumAndAverage(array, n);
        Sorting(array, n);
        output(array, n);
    }
}
