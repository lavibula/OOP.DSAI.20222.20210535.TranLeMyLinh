package Lab01;
import java.io.*;
public class HelloWorld{
	public static void main(String[] args) {
		try {
			File file = new File("answer.txt");
            FileWriter fw = new FileWriter(file, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("------------------------ 2.1 ------------------------");
            pw.println("Xin chao \n cac ban!");
            pw.println("Hello \t world!");
            
            pw.close();
            fw.close();
		} catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
	}
}