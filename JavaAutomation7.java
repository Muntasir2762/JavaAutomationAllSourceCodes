package javaautomation7;

import java.util.Scanner;


public class JavaAutomation7 {
    
      public static int compare(int x,int y){
          
          if(x == y){
              return 0;
          }
          
	    if(x % 6 == y % 6){
                return (x < y) ? x : y;
            }
            
            else{
                return (x > y) ? x : y;
            }
	    
     }
        

    public static void main(String[] args) {
        
        int a,b;
        System.out.print("Input the first number : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();  
        System.out.print("Input the second number: ");
        b = sc.nextInt(); 
        
        int result=compare(a,b);
	System.out.println("Result: "+result);

        
    }
    
}
    