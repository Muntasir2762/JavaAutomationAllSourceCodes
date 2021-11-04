package javaautomation8;

import java.util.Arrays;


public class JavaAutomation8 {

   
    public static void main(String[] args) {
        
        int[] array = {20, 30, 40};
	System.out.println("Original Array: "+Arrays.toString(array)); 
	int larger_value = array[0];
	if(array[2] >= larger_value){
            larger_value = array[2];
        }
        
	System.out.println("Larger value between first and last element: "+larger_value); 	 
 }
    }
    
