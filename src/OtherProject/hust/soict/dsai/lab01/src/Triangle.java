package OtherProject.hust.soict.dsai.lab01.src;

import java.util.Scanner;
import java.io.*;

public class Triangle {
    public static void main(String[] args) {
        try {
        	File file = new File("answer.txt");
            FileWriter fw = new FileWriter(file,true);
            PrintWriter pw = new PrintWriter(fw);

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your favorite number!");
            int num = input.nextInt();
            pw.println("------------------------ 6.3 ------------------------");
            pw.println("Please enter your favorite number!");
            pw.println(num);
            int i, j, star = 1;     
            for (i=0; i<num; i++)   
            {       
                for (j=num-i; j>1; j--)   
                {   
                	System.out.print(" ");
                    pw.print(" ");   
                }   
                for (j=1; j<=star; j++)   
                {     
                	System.out.print("*");
                    pw.print("*");   
                }   
                System.out.println();
                pw.println();   
                
                star +=2;
            }
            
            pw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
