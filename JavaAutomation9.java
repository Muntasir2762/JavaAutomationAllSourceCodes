package javaautomation9;

import java.util.Scanner;


public class JavaAutomation9 {

    
    public static void main(String[] args) {
        
        double inch;
        double meters;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a value for inch: ");
        inch = sc.nextDouble();
        meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
    
}
