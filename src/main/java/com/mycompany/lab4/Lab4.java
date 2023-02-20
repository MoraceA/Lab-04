/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab4;

/**
 *
 * @author ariana
 */
public class Lab4 {

    public static void main(String[] args) {
     helloWorld(5);
     multipleSevens(1,3);
  
    }
    


    //Write a function that prints "Hello World" n times recursively. //
    public static void helloWorld(int count){
        System.out.println("Hello World!");
        if(count<=1){
            return;
            
        }
        helloWorld(count -1);
    }
    
    //Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.//
    
    public static int multipleSevens(int n1, int n2){
   
               if (n1 > n2) {
            return 0;
        }
        // Recursive case: add n1 to the sum if it is a multiple of 7 and call the function again with n1+1 and n2
        if (n1 % 7 == 0) {
            return n1 + multipleSevens(n1+1, n2);
        }
        // Recursive case: don't add n1 to the sum if it is not a multiple of 7 and call the function again with n1+1 and n2
        else {
            return multipleSevens(n1+1, n2);
        
    }
    
        
            //Write a function that implements the binary search algorithm recursively.//

      public static int binarySearch(int search, int[]array){
        int start = 0;
        int end = array.length -1;
        
        while (start <= end){
            int middle = (start + end)/2;
            if (search < array[middle]){
                end = middle -1;
            }
            if (search > array[middle]){
                start = middle + 1;
        }
        if ( search == array[middle]){
            return middle;
        
        }
        }
        
        
        
        
        
        
        


    
    
    
    
    
    

