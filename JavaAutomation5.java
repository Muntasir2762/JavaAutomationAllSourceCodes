package javaautomation5;

import java.util.Scanner;

public class JavaAutomation5 {

    public static void main(String[] args) {
         String line;
         System.out.print("Input a String: ");
         Scanner sc = new Scanner(System.in);
	 line = sc.nextLine();
	 line = line.toLowerCase();
	 System.out.println(line); 
    }
    
}
