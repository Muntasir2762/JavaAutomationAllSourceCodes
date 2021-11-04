package javaautomation10;

import java.util.Scanner;


public class JavaAutomation10 {

  
    public static void main(String[] args) {
        
        double weight,inches,BMI; 
        System.out.print("Input weight in pounds: ");
        Scanner sc = new Scanner(System.in);
        
        weight = sc.nextDouble();

        System.out.print("Input height in inches: ");
        inches = sc.nextDouble();

        BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
    }
    
}
