package javaautomation6;

import java.util.Scanner;

public class JavaAutomation6 {


    public static void main(String[] args) {
        
         String word;
         System.out.print("Input a word: ");
         Scanner sc = new Scanner(System.in);
	 word = sc.nextLine();
         
	 word = word.trim();
	 String result = ""; 
         char[] ch=word.toCharArray();  
	 for (int i = ch.length - 1; i >= 0; i--) {
			 result += ch[i];
		 }
	 System.out.println("Reverse word: "+result.trim()); 
	 }	
    }
    
