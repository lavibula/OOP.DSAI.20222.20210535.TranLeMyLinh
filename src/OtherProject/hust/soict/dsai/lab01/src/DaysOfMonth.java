package OtherProject.hust.soict.dsai.lab01.src;

import java.util.Scanner;

    public class DaysOfMonth {
        static Scanner keyboard = new Scanner(System.in);
        static int m;
        
        static String[] monthStr = {"January", "February", "March", "April", "May", "June", "July", 
        "August", "September", "October", "November", "December"};
        static String[] month3Str = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", 
        "Aug", "Sep", "Oct", "Nov", "Dec"};
        static String[] month3Str_dot = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", 
        "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
        static void day(int m, int y){
            int d;
            if (m == 2){
                if (y % 4 == 0 || (y % 100 != 0 && y % 400 == 0)) {
                    d = 29;
                }
                else {d = 28;}
            } else if (m == 4 || m == 6 || m == 9 || m == 11){
                d = 30;
            } else {
                d = 31;
            }
            String mm = month3Str[m-1];
            System.out.println("The number of days of " + mm + ", " + y + ": " + d);
        }
      
        static int month(String month){

            for (int i=0; i < 12; i++) {
                if (monthStr[i].equals(month) || month3Str[i].equals(month) 
                || month3Str_dot[i].equals(month)) {
                    m = i+1;
                    break;
                }
            }
            return m;
        }
        public static void main(String[] args){
            System.out.println("Please enter your month: ");
            if(keyboard.hasNextInt()) {
                int num = keyboard.nextInt();
                m = num;
            }
            else {
                String month = keyboard.nextLine();
                month(month);
            }
            int year = 0;
            do {
                System.out.println("Please enter your year: ");
                year = keyboard.nextInt();
                if (year <= 0) {
                    System.out.println("Enter a positive integer, try again!");
                }
            } while(year<=0);

            day(m,year);

        }
    }
