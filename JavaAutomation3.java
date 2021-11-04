package javaautomation3;

import java.util.Scanner;

public class JavaAutomation3 {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        
        System.out.println("Input first number:");
        Scanner sc1= new Scanner(System.in);
        firstNumber= sc1.nextInt();
        
        System.out.println("Input first number:");
        Scanner sc2= new Scanner(System.in);
        secondNumber= sc2.nextInt();
        
        int result=firstNumber*secondNumber;
        
        System.out.println(firstNumber +"X" +secondNumber +"=" +result);
    }
    
}
