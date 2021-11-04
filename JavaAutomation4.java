package javaautomation4;

import java.util.Scanner;

public class JavaAutomation4 {

    public static void main(String[] args) {
        
        int number;
        System.out.println("Input a number:");
        Scanner sc=new Scanner(System.in);
        number= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number +"X" +i +"=" +number*i);
        }
    }
    
}
